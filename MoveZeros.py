class MoveZeros(object):
    def moveZero(self, nums):
        insert_index = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[insert_index]=nums[i]
                insert_index += 1
        for i in range(insert_index, len(nums)):
            nums[i]=0

nums = [0,1,5,0,3,8,0,0,9]
ob1 = MoveZeros()
ob1.moveZero(nums)
print(nums)
