package isw.project.model;

public class ClassifierEvaluation {

    private final String projName;
    private final int walkForwardIterationIndex;
    private double trainingPercent;
    private final String classifier;
    private final boolean featureSelection;
    private final String sampling;
    private final String costSensitive;
    private double precision;
    private double recall;
    private double auc;
    private double kappa;
    private double tp;
    private double fp;
    private double tn;
    private double fn;

    public ClassifierEvaluation(String projName, int index, String classifier, boolean featureSelection, String sampling, String costSensitive) {
        this.projName = projName;
        this.walkForwardIterationIndex = index;
        this.classifier = classifier;
        this.featureSelection = featureSelection;
        this.sampling = sampling;
        this.costSensitive = costSensitive;

        this.trainingPercent = 0.0;
        this.precision = 0;
        this.recall = 0;
        this.auc = 0;
        this.kappa = 0;
        this.tp = 0;
        this.fp = 0;
        this.tn = 0;
        this.fn = 0;

    }




    public int getWalkForwardIterationIndex() {
        return walkForwardIterationIndex;
    }

    public String getClassifier() {
        return classifier;
    }

    public boolean isFeatureSelection() {
        return featureSelection;
    }

    public String getSampling() {
        return sampling;
    }

    /**
     * @return the costSensitive
     */
    public String getCostSensitive() {
        return costSensitive;
    }

    public double getPrecision() {
        return precision;
    }
    /**
     * @param precision the precision to set
     */
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    /**
     * @return the recall
     */
    public double getRecall() {
        return recall;
    }
    /**
     * @param recall the recall to set
     */
    public void setRecall(double recall) {
        this.recall = recall;
    }
    /**
     * @return the auc
     */
    public double getAuc() {
        return auc;
    }
    /**
     * @param auc the auc to set
     */
    public void setAuc(double auc) {
        this.auc = auc;
    }
    /**
     * @return the kappa
     */
    public double getKappa() {
        return kappa;
    }
    /**
     * @param kappa the kappa to set
     */
    public void setKappa(double kappa) {
        this.kappa = kappa;
    }

    /**
     * @return the trainingPercent
     */
    public double getTrainingPercent() {
        return trainingPercent;
    }

    /**
     * @param trainingPercent the trainingPercent to set
     */
    public void setTrainingPercent(double trainingPercent) {
        this.trainingPercent = trainingPercent;
    }

    /**
     * @return the tp
     */
    public double getTp() {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(double tp) {
        this.tp = tp;
    }

    /**
     * @return the fp
     */
    public double getFp() {
        return fp;
    }

    /**
     * @param fp the fp to set
     */
    public void setFp(double fp) {
        this.fp = fp;
    }

    /**
     * @return the tn
     */
    public double getTn() {
        return tn;
    }

    /**
     * @param tn the tn to set
     */
    public void setTn(double tn) {
        this.tn = tn;
    }

    /**
     * @return the fn
     */
    public double getFn() {
        return fn;
    }

    /**
     * @param fn the fn to set
     */
    public void setFn(double fn) {
        this.fn = fn;
    }


}

