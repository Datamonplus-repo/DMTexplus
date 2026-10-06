package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrparproget extends GXProcedure
{
   public mrparproget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrparproget.class ), "" );
   }

   public mrparproget( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              java.util.Date aP2 ,
                              String aP3 ,
                              long aP4 ,
                              String[] aP5 )
   {
      mrparproget.this.aP6 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        long aP4 ,
                        String[] aP5 ,
                        boolean[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             long aP4 ,
                             String[] aP5 ,
                             boolean[] aP6 )
   {
      mrparproget.this.AV11MRParPrUsu = aP0;
      mrparproget.this.AV12MRParPrIp = aP1;
      mrparproget.this.AV13MRParPrReg = aP2;
      mrparproget.this.AV14MRParPrTkn = aP3;
      mrparproget.this.AV9MRParPrId = aP4;
      mrparproget.this.aP5 = aP5;
      mrparproget.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = false ;
      AV10MRParPrPLC = "" ;
      /* Using cursor P0AV42 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV9MRParPrId), AV11MRParPrUsu, AV12MRParPrIp, AV13MRParPrReg, AV14MRParPrTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14680MRParPrId = P0AV42_A14680MRParPrId[0] ;
         A14783MRParPrTkn = P0AV42_A14783MRParPrTkn[0] ;
         A14782MRParPrReg = P0AV42_A14782MRParPrReg[0] ;
         A14781MRParPrIp = P0AV42_A14781MRParPrIp[0] ;
         A14780MRParPrUsu = P0AV42_A14780MRParPrUsu[0] ;
         A14779MRParPrDsc = P0AV42_A14779MRParPrDsc[0] ;
         AV10MRParPrPLC = A14779MRParPrDsc ;
         AV8Existe = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = mrparproget.this.AV10MRParPrPLC;
      this.aP6[0] = mrparproget.this.AV8Existe;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10MRParPrPLC = "" ;
      scmdbuf = "" ;
      P0AV42_A14680MRParPrId = new long[1] ;
      P0AV42_A14783MRParPrTkn = new String[] {""} ;
      P0AV42_A14782MRParPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV42_A14781MRParPrIp = new String[] {""} ;
      P0AV42_A14780MRParPrUsu = new String[] {""} ;
      P0AV42_A14779MRParPrDsc = new String[] {""} ;
      A14783MRParPrTkn = "" ;
      A14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14781MRParPrIp = "" ;
      A14780MRParPrUsu = "" ;
      A14779MRParPrDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparproget__default(),
         new Object[] {
             new Object[] {
            P0AV42_A14680MRParPrId, P0AV42_A14783MRParPrTkn, P0AV42_A14782MRParPrReg, P0AV42_A14781MRParPrIp, P0AV42_A14780MRParPrUsu, P0AV42_A14779MRParPrDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV9MRParPrId ;
   private long A14680MRParPrId ;
   private String AV11MRParPrUsu ;
   private String scmdbuf ;
   private String A14780MRParPrUsu ;
   private java.util.Date AV13MRParPrReg ;
   private java.util.Date A14782MRParPrReg ;
   private boolean AV8Existe ;
   private String AV12MRParPrIp ;
   private String AV14MRParPrTkn ;
   private String AV10MRParPrPLC ;
   private String A14783MRParPrTkn ;
   private String A14781MRParPrIp ;
   private String A14779MRParPrDsc ;
   private boolean[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P0AV42_A14680MRParPrId ;
   private String[] P0AV42_A14783MRParPrTkn ;
   private java.util.Date[] P0AV42_A14782MRParPrReg ;
   private String[] P0AV42_A14781MRParPrIp ;
   private String[] P0AV42_A14780MRParPrUsu ;
   private String[] P0AV42_A14779MRParPrDsc ;
}

final  class mrparproget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AV42", "SELECT MRParPrId, MRParPrTkn, MRParPrReg, MRParPrIp, MRParPrUsu, MRParPrDsc FROM MRParPr WHERE (MRParPrId = ?) AND (MRParPrUsu = ?) AND (MRParPrIp = ?) AND (MRParPrReg = ?) AND (MRParPrTkn = ?) ORDER BY MRParPrId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 20);
               stmt.setDateTime(4, (java.util.Date)parms[3], false, true);
               stmt.setVarchar(5, (String)parms[4], 256);
               return;
      }
   }

}

