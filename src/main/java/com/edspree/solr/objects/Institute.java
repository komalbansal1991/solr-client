package com.edspree.solr.objects;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "matriculla", name = "institutes", readConsistency = "QUORUM",
        writeConsistency = "QUORUM",
        caseSensitiveKeyspace = false,
        caseSensitiveTable = false)
public class Institute {
    private String id;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    @PartitionKey(0)   
    @Column(name = "institute_id")
    private String instituteId;
    @PartitionKey(1)
    @Column(name = "batch_id")
    private String batchId;
    @Column(name = "about_us")
    private String aboutUs;
    @Column(name = "avg_batch_size")
    private String avgBatchSize;
    @Column(name = "avg_fees")
    private String avgFees;
    @Column(name = "avg_teacher_exp")
    private String avgTeachExp;
    @Column(name = "board")
    private String board;
    @Column(name = "class")
    private String std;
    @Column(name = "contact_num")
    private String contactNum;
    @Column(name = "demo_available")
    private String demoAvailable;
    @Column(name = "discount")
    private String discount;
    @Column(name = "doubt_classes_available")
    private String doubtClassesAvail;
    @Column(name = "exam_pattern")
    private String examPattern;
    @Column(name = "faculty")
    private String faculty;
    @Column(name = "fees")
    private String fees;
    @Column(name = "highlights")
    private String highlights;
    @Column(name = "likes")
    private String likes;
    @Column(name = "location")
    private Address location;
    @Column(name = "misc_comments")
    private String miscComments;
    @Column(name = "name")
    private String name;
    @Column(name = "num_of_students")
    private String numOfStudents;
    @Column(name = "other_branches")
    private String otherBranches;
    @Column(name = "prev_year_avg_result")
    private String prevYearAvgRes;
    @Column(name = "prev_year_best_result")
    private String prevYeadBestRes;
    @Column(name = "results")
    private String results;
    @Column(name = "special_offers")
    private String specialOffers;
    @Column(name = "students_schools")
    private String studentsSchools;
    @Column(name = "study_material_avail")
    private String studyMaterialAvail;
    @Column(name = "subject")
    private String subject;
    @Column(name = "teacher")
    private String teacher;
    @Column(name = "timings")
    private String timings;
    @Column(name = "website_url")
    private String websiteURL;
    /**
     * @return the instituteId
     */
    public String getInstituteId() {
        return instituteId;
    }
    /**
     * @param instituteId the instituteId to set
     */
    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }
    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }
    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    /**
     * @return the aboutUs
     */
    public String getAboutUs() {
        return aboutUs;
    }
    /**
     * @param aboutUs the aboutUs to set
     */
    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }
    /**
     * @return the avgBatchSize
     */
    public String getAvgBatchSize() {
        return avgBatchSize;
    }
    /**
     * @param avgBatchSize the avgBatchSize to set
     */
    public void setAvgBatchSize(String avgBatchSize) {
        this.avgBatchSize = avgBatchSize;
    }
    /**
     * @return the avgFees
     */
    public String getAvgFees() {
        return avgFees;
    }
    /**
     * @param avgFees the avgFees to set
     */
    public void setAvgFees(String avgFees) {
        this.avgFees = avgFees;
    }
    /**
     * @return the avgTeachExp
     */
    public String getAvgTeachExp() {
        return avgTeachExp;
    }
    /**
     * @param avgTeachExp the avgTeachExp to set
     */
    public void setAvgTeachExp(String avgTeachExp) {
        this.avgTeachExp = avgTeachExp;
    }
    /**
     * @return the board
     */
    public String getBoard() {
        return board;
    }
    /**
     * @param board the board to set
     */
    public void setBoard(String board) {
        this.board = board;
    }
    /**
     * @return the std
     */
    public String getStd() {
        return std;
    }
    /**
     * @param std the std to set
     */
    public void setStd(String std) {
        this.std = std;
    }
    /**
     * @return the contactNum
     */
    public String getContactNum() {
        return contactNum;
    }
    /**
     * @param contactNum the contactNum to set
     */
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    /**
     * @return the demoAvailable
     */
    public String getDemoAvailable() {
        return demoAvailable;
    }
    /**
     * @param demoAvailable the demoAvailable to set
     */
    public void setDemoAvailable(String demoAvailable) {
        this.demoAvailable = demoAvailable;
    }
    /**
     * @return the discount
     */
    public String getDiscount() {
        return discount;
    }
    /**
     * @param discount the discount to set
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    /**
     * @return the doubtClassesAvail
     */
    public String getDoubtClassesAvail() {
        return doubtClassesAvail;
    }
    /**
     * @param doubtClassesAvail the doubtClassesAvail to set
     */
    public void setDoubtClassesAvail(String doubtClassesAvail) {
        this.doubtClassesAvail = doubtClassesAvail;
    }
    /**
     * @return the examPattern
     */
    public String getExamPattern() {
        return examPattern;
    }
    /**
     * @param examPattern the examPattern to set
     */
    public void setExamPattern(String examPattern) {
        this.examPattern = examPattern;
    }
    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }
    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    /**
     * @return the fees
     */
    public String getFees() {
        return fees;
    }
    /**
     * @param fees the fees to set
     */
    public void setFees(String fees) {
        this.fees = fees;
    }
    /**
     * @return the highlights
     */
    public String getHighlights() {
        return highlights;
    }
    /**
     * @param highlights the highlights to set
     */
    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }
    /**
     * @return the likes
     */
    public String getLikes() {
        return likes;
    }
    /**
     * @param likes the likes to set
     */
    public void setLikes(String likes) {
        this.likes = likes;
    }
    /**
     * @return the location
     */
    public Address getLocation() {
        return location;
    }
    /**
     * @param location the location to set
     */
    public void setLocation(Address location) {
        this.location = location;
    }
    /**
     * @return the miscComments
     */
    public String getMiscComments() {
        return miscComments;
    }
    /**
     * @param miscComments the miscComments to set
     */
    public void setMiscComments(String miscComments) {
        this.miscComments = miscComments;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the numOfStudents
     */
    public String getNumOfStudents() {
        return numOfStudents;
    }
    /**
     * @param numOfStudents the numOfStudents to set
     */
    public void setNumOfStudents(String numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
    /**
     * @return the otherBranches
     */
    public String getOtherBranches() {
        return otherBranches;
    }
    /**
     * @param otherBranches the otherBranches to set
     */
    public void setOtherBranches(String otherBranches) {
        this.otherBranches = otherBranches;
    }
    /**
     * @return the prevYearAvgRes
     */
    public String getPrevYearAvgRes() {
        return prevYearAvgRes;
    }
    /**
     * @param prevYearAvgRes the prevYearAvgRes to set
     */
    public void setPrevYearAvgRes(String prevYearAvgRes) {
        this.prevYearAvgRes = prevYearAvgRes;
    }
    /**
     * @return the prevYeadBestRes
     */
    public String getPrevYeadBestRes() {
        return prevYeadBestRes;
    }
    /**
     * @param prevYeadBestRes the prevYeadBestRes to set
     */
    public void setPrevYeadBestRes(String prevYeadBestRes) {
        this.prevYeadBestRes = prevYeadBestRes;
    }
    /**
     * @return the results
     */
    public String getResults() {
        return results;
    }
    /**
     * @param results the results to set
     */
    public void setResults(String results) {
        this.results = results;
    }
    /**
     * @return the specialOffers
     */
    public String getSpecialOffers() {
        return specialOffers;
    }
    /**
     * @param specialOffers the specialOffers to set
     */
    public void setSpecialOffers(String specialOffers) {
        this.specialOffers = specialOffers;
    }
    /**
     * @return the studentsSchools
     */
    public String getStudentsSchools() {
        return studentsSchools;
    }
    /**
     * @param studentsSchools the studentsSchools to set
     */
    public void setStudentsSchools(String studentsSchools) {
        this.studentsSchools = studentsSchools;
    }
    /**
     * @return the studyMaterialAvail
     */
    public String getStudyMaterialAvail() {
        return studyMaterialAvail;
    }
    /**
     * @param studyMaterialAvail the studyMaterialAvail to set
     */
    public void setStudyMaterialAvail(String studyMaterialAvail) {
        this.studyMaterialAvail = studyMaterialAvail;
    }
    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }
    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * @return the teacher
     */
    public String getTeacher() {
        return teacher;
    }
    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    /**
     * @return the timings
     */
    public String getTimings() {
        return timings;
    }
    /**
     * @param timings the timings to set
     */
    public void setTimings(String timings) {
        this.timings = timings;
    }
    /**
     * @return the websiteURL
     */
    public String getWebsiteURL() {
        return websiteURL;
    }
    /**
     * @param websiteURL the websiteURL to set
     */
    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

}
