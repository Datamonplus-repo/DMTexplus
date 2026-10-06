package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrparprohdrget extends GXProcedure
{
   public mrparprohdrget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrparprohdrget.class ), "" );
   }

   public mrparprohdrget( int remoteHandle ,
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
                              String[] aP5 ,
                              String[] aP6 ,
                              String[] aP7 ,
                              short[] aP8 ,
                              String[] aP9 )
   {
      mrparprohdrget.this.aP10 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        long aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        boolean[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             long aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             boolean[] aP10 )
   {
      mrparprohdrget.this.AV11MRParPrUsu = aP0;
      mrparprohdrget.this.AV12MRParPrIp = aP1;
      mrparprohdrget.this.AV13MRParPrReg = aP2;
      mrparprohdrget.this.AV14MRParPrTkn = aP3;
      mrparprohdrget.this.AV9MRParPrId = aP4;
      mrparprohdrget.this.aP5 = aP5;
      mrparprohdrget.this.aP6 = aP6;
      mrparprohdrget.this.aP7 = aP7;
      mrparprohdrget.this.aP8 = aP8;
      mrparprohdrget.this.aP9 = aP9;
      mrparprohdrget.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "ingresa: &MRParPrUsu=%1, &MRParPrIp=%2, &MRParPrReg=%3, &MRParPrTkn=%4, &MRParPrId=%5.", ""), AV11MRParPrUsu, AV12MRParPrIp, localUtil.ttoc( AV13MRParPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV14MRParPrTkn, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9MRParPrId), 10, 0), "", "", "", ""), AV21Pgmname) ;
      AV8Existe = false ;
      AV10MRParPrPLC = "" ;
      AV15MRParPrHdr = "" ;
      AV18MRParPrMaqCod = "" ;
      AV17MRParPrFasCod = "" ;
      /* Using cursor P0AV62 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV9MRParPrId), AV11MRParPrUsu, AV12MRParPrIp, AV14MRParPrTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14680MRParPrId = P0AV62_A14680MRParPrId[0] ;
         A14783MRParPrTkn = P0AV62_A14783MRParPrTkn[0] ;
         A14781MRParPrIp = P0AV62_A14781MRParPrIp[0] ;
         A14780MRParPrUsu = P0AV62_A14780MRParPrUsu[0] ;
         A14779MRParPrDsc = P0AV62_A14779MRParPrDsc[0] ;
         A14784MRParPrHdr = P0AV62_A14784MRParPrHdr[0] ;
         A14785MRParPrMaq = P0AV62_A14785MRParPrMaq[0] ;
         A14786MRParPrFas = P0AV62_A14786MRParPrFas[0] ;
         A14778MRParPrCod = P0AV62_A14778MRParPrCod[0] ;
         AV10MRParPrPLC = A14779MRParPrDsc ;
         AV15MRParPrHdr = A14784MRParPrHdr ;
         AV18MRParPrMaqCod = A14785MRParPrMaq ;
         AV17MRParPrFasCod = A14786MRParPrFas ;
         AV16MRParPrCod = A14778MRParPrCod ;
         AV8Existe = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = mrparprohdrget.this.AV15MRParPrHdr;
      this.aP6[0] = mrparprohdrget.this.AV18MRParPrMaqCod;
      this.aP7[0] = mrparprohdrget.this.AV17MRParPrFasCod;
      this.aP8[0] = mrparprohdrget.this.AV16MRParPrCod;
      this.aP9[0] = mrparprohdrget.this.AV10MRParPrPLC;
      this.aP10[0] = mrparprohdrget.this.AV8Existe;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15MRParPrHdr = "" ;
      AV18MRParPrMaqCod = "" ;
      AV17MRParPrFasCod = "" ;
      AV10MRParPrPLC = "" ;
      AV21Pgmname = "" ;
      scmdbuf = "" ;
      P0AV62_A14680MRParPrId = new long[1] ;
      P0AV62_A14783MRParPrTkn = new String[] {""} ;
      P0AV62_A14781MRParPrIp = new String[] {""} ;
      P0AV62_A14780MRParPrUsu = new String[] {""} ;
      P0AV62_A14779MRParPrDsc = new String[] {""} ;
      P0AV62_A14784MRParPrHdr = new String[] {""} ;
      P0AV62_A14785MRParPrMaq = new String[] {""} ;
      P0AV62_A14786MRParPrFas = new String[] {""} ;
      P0AV62_A14778MRParPrCod = new short[1] ;
      A14783MRParPrTkn = "" ;
      A14781MRParPrIp = "" ;
      A14780MRParPrUsu = "" ;
      A14779MRParPrDsc = "" ;
      A14784MRParPrHdr = "" ;
      A14785MRParPrMaq = "" ;
      A14786MRParPrFas = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparprohdrget__default(),
         new Object[] {
             new Object[] {
            P0AV62_A14680MRParPrId, P0AV62_A14783MRParPrTkn, P0AV62_A14781MRParPrIp, P0AV62_A14780MRParPrUsu, P0AV62_A14779MRParPrDsc, P0AV62_A14784MRParPrHdr, P0AV62_A14785MRParPrMaq, P0AV62_A14786MRParPrFas, P0AV62_A14778MRParPrCod
            }
         }
      );
      AV21Pgmname = "Ingenieria.MRParProHdrGet" ;
      /* GeneXus formulas. */
      AV21Pgmname = "Ingenieria.MRParProHdrGet" ;
      Gx_err = (short)(0) ;
   }

   private short AV16MRParPrCod ;
   private short A14778MRParPrCod ;
   private short Gx_err ;
   private long AV9MRParPrId ;
   private long A14680MRParPrId ;
   private String AV11MRParPrUsu ;
   private String AV15MRParPrHdr ;
   private String AV18MRParPrMaqCod ;
   private String AV17MRParPrFasCod ;
   private String AV21Pgmname ;
   private String scmdbuf ;
   private String A14780MRParPrUsu ;
   private String A14784MRParPrHdr ;
   private String A14785MRParPrMaq ;
   private String A14786MRParPrFas ;
   private java.util.Date AV13MRParPrReg ;
   private boolean AV8Existe ;
   private String AV12MRParPrIp ;
   private String AV14MRParPrTkn ;
   private String AV10MRParPrPLC ;
   private String A14783MRParPrTkn ;
   private String A14781MRParPrIp ;
   private String A14779MRParPrDsc ;
   private boolean[] aP10 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private long[] P0AV62_A14680MRParPrId ;
   private String[] P0AV62_A14783MRParPrTkn ;
   private String[] P0AV62_A14781MRParPrIp ;
   private String[] P0AV62_A14780MRParPrUsu ;
   private String[] P0AV62_A14779MRParPrDsc ;
   private String[] P0AV62_A14784MRParPrHdr ;
   private String[] P0AV62_A14785MRParPrMaq ;
   private String[] P0AV62_A14786MRParPrFas ;
   private short[] P0AV62_A14778MRParPrCod ;
}

final  class mrparprohdrget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AV62", "SELECT MRParPrId, MRParPrTkn, MRParPrIp, MRParPrUsu, MRParPrDsc, MRParPrHdr, MRParPrMaq, MRParPrFas, MRParPrCod FROM MRParPr WHERE (MRParPrId = ?) AND (MRParPrUsu = ?) AND (MRParPrIp = ?) AND (MRParPrTkn = ?) ORDER BY MRParPrId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setVarchar(4, (String)parms[3], 256);
               return;
      }
   }

}

