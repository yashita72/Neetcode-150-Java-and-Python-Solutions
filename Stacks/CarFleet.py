class Solution:
    def carFleet(self, target: int, position: list[int], speed: list[int]) -> int:
        cars=sorted(zip(position,speed),reverse=True)#zip is used to combine position and speed of each car
        #sort cars in decreasing order of position
        stack=[]#stack to keep track of the time taken for each car to reach the target
        for pos,sped in cars:
            time=(target-pos)/sped
            if not stack or time>stack[-1]:#if stack is empty or time is greater than the top of the stack, push time onto the stack
                stack.append(time)
        return len(stack)
    #Time complexity: O(nlogn) for sorting the cars and O(n) for iterating through the cars,
    # so overall time complexity is O(nlogn). Space complexity: O(n) for the stack.


        