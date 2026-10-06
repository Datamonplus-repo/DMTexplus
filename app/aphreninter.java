package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aphreninter extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aphreninter pgm = new aphreninter (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aphreninter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aphreninter.class ), "" );
   }

   public aphreninter( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      aphreninter.this.AV10EmprCod = GXv_char1[0] ;
      aphreninter.this.AV11EmprNom = GXv_char2[0] ;
      aphreninter.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P052K2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4492HreBarCod = P052K2_A4492HreBarCod[0] ;
         A4493HreBarReo = P052K2_A4493HreBarReo[0] ;
         A4494HreBarPar = P052K2_A4494HreBarPar[0] ;
         A4495HreNumCie = P052K2_A4495HreNumCie[0] ;
         A396EmprCod = P052K2_A396EmprCod[0] ;
         A10102HreNumInt = P052K2_A10102HreNumInt[0] ;
         n10102HreNumInt = P052K2_n10102HreNumInt[0] ;
         A4545HreLinMaq = P052K2_A4545HreLinMaq[0] ;
         /* Using cursor P052K3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         A4529HreFecTin = P052K3_A4529HreFecTin[0] ;
         n4529HreFecTin = P052K3_n4529HreFecTin[0] ;
         A12264HreNInter = P052K3_A12264HreNInter[0] ;
         n12264HreNInter = P052K3_n12264HreNInter[0] ;
         if ( (( GXutil.resetTime(A4529HreFecTin).after( GXutil.resetTime( AV12Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A4529HreFecTin), GXutil.resetTime(AV12Fec1)) )) )
         {
            if ( (( GXutil.resetTime(A4529HreFecTin).before( GXutil.resetTime( AV13Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A4529HreFecTin), GXutil.resetTime(AV13Fec2)) )) )
            {
               A12264HreNInter = A10102HreNumInt ;
               n12264HreNInter = false ;
               Gx_msg = httpContext.getMessage( "Procesando.... ", "") + localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               AV14Control = ">" + Gx_msg ;
               System.out.println( AV14Control );
               /* Using cursor P052K4 */
               pr_default.execute(2, new Object[] {Boolean.valueOf(n12264HreNInter), Integer.valueOf(A12264HreNInter), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(phreninter.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aphreninter");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P052K2_A4492HreBarCod = new int[1] ;
      P052K2_A4493HreBarReo = new byte[1] ;
      P052K2_A4494HreBarPar = new String[] {""} ;
      P052K2_A4495HreNumCie = new byte[1] ;
      P052K2_A396EmprCod = new String[] {""} ;
      P052K2_A10102HreNumInt = new int[1] ;
      P052K2_n10102HreNumInt = new boolean[] {false} ;
      P052K2_A4545HreLinMaq = new short[1] ;
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      P052K3_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P052K3_n4529HreFecTin = new boolean[] {false} ;
      P052K3_A12264HreNInter = new int[1] ;
      P052K3_n12264HreNInter = new boolean[] {false} ;
      A4529HreFecTin = GXutil.nullDate() ;
      AV12Fec1 = GXutil.nullDate() ;
      AV13Fec2 = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV14Control = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aphreninter__default(),
         new Object[] {
             new Object[] {
            P052K2_A4492HreBarCod, P052K2_A4493HreBarReo, P052K2_A4494HreBarPar, P052K2_A4495HreNumCie, P052K2_A396EmprCod, P052K2_A10102HreNumInt, P052K2_n10102HreNumInt, P052K2_A4545HreLinMaq
            }
            , new Object[] {
            P052K3_A4529HreFecTin, P052K3_n4529HreFecTin, P052K3_A12264HreNInter, P052K3_n12264HreNInter
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private int A10102HreNumInt ;
   private int A12264HreNInter ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A4494HreBarPar ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV12Fec1 ;
   private java.util.Date AV13Fec2 ;
   private boolean n10102HreNumInt ;
   private boolean n4529HreFecTin ;
   private boolean n12264HreNInter ;
   private String AV14Control ;
   private IDataStoreProvider pr_default ;
   private int[] P052K2_A4492HreBarCod ;
   private byte[] P052K2_A4493HreBarReo ;
   private String[] P052K2_A4494HreBarPar ;
   private byte[] P052K2_A4495HreNumCie ;
   private String[] P052K2_A396EmprCod ;
   private int[] P052K2_A10102HreNumInt ;
   private boolean[] P052K2_n10102HreNumInt ;
   private short[] P052K2_A4545HreLinMaq ;
   private java.util.Date[] P052K3_A4529HreFecTin ;
   private boolean[] P052K3_n4529HreFecTin ;
   private int[] P052K3_A12264HreNInter ;
   private boolean[] P052K3_n12264HreNInter ;
}

final  class aphreninter__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P052K2", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, EmprCod, HreNumInt, HreLinMaq FROM TXPHISREM WHERE (EmprCod = ?) AND (EmprCod = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P052K3", "SELECT HreFecTin, HreNInter FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P052K4", "UPDATE TXPHISREH SET HreNInter=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREH")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

