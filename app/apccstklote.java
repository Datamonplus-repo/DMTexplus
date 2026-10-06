package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apccstklote extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apccstklote pgm = new apccstklote (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apccstklote( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apccstklote.class ), "" );
   }

   public apccstklote( int remoteHandle ,
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
      AV26UsurCod = " " ;
      AV23Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV24EmprCod ;
      GXv_char2[0] = AV25EmprNom ;
      GXv_char3[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char1, GXv_char2, GXv_char3) ;
      apccstklote.this.AV24EmprCod = GXv_char1[0] ;
      apccstklote.this.AV25EmprNom = GXv_char2[0] ;
      apccstklote.this.AV26UsurCod = GXv_char3[0] ;
      /* Using cursor P04TD2 */
      pr_default.execute(0, new Object[] {AV24EmprCod, AV21Fec1, AV22Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04TD2_A396EmprCod[0] ;
         A4492HreBarCod = P04TD2_A4492HreBarCod[0] ;
         A4493HreBarReo = P04TD2_A4493HreBarReo[0] ;
         A4494HreBarPar = P04TD2_A4494HreBarPar[0] ;
         A4495HreNumCie = P04TD2_A4495HreNumCie[0] ;
         A4529HreFecTin = P04TD2_A4529HreFecTin[0] ;
         n4529HreFecTin = P04TD2_n4529HreFecTin[0] ;
         AV36HreFectin = A4529HreFecTin ;
         /* Using cursor P04TD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), AV33Prdnum1, AV34Prdnum2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4558HrePrdNum = P04TD3_A4558HrePrdNum[0] ;
            n4558HrePrdNum = P04TD3_n4558HrePrdNum[0] ;
            A5726HreLote = P04TD3_A5726HreLote[0] ;
            n5726HreLote = P04TD3_n5726HreLote[0] ;
            A719PrdNum = P04TD3_A719PrdNum[0] ;
            n719PrdNum = P04TD3_n719PrdNum[0] ;
            A4559HrePrdDsc = P04TD3_A4559HrePrdDsc[0] ;
            n4559HrePrdDsc = P04TD3_n4559HrePrdDsc[0] ;
            A4545HreLinMaq = P04TD3_A4545HreLinMaq[0] ;
            A4550HreLinPro = P04TD3_A4550HreLinPro[0] ;
            A4557HreRecLin = P04TD3_A4557HreRecLin[0] ;
            AV27HrePrdnum = A4558HrePrdNum ;
            AV28Ccstkbar = A4492HreBarCod ;
            AV29Ccstkreo = A4493HreBarReo ;
            AV30Ccstkpar = A4494HreBarPar ;
            AV31Prdnum = A719PrdNum ;
            AV32Hrelote = A5726HreLote ;
            /* Execute user subroutine: 'CCSTKS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            Gx_msg = httpContext.getMessage( "Procesando.... ", "") + localUtil.dtoc( AV36HreFectin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + GXutil.str( A4492HreBarCod, 8, 0) + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar + " " + GXutil.str( A4495HreNumCie, 2, 0) + " " + GXutil.str( A4545HreLinMaq, 4, 0) + " " + GXutil.trim( A4559HrePrdDsc) + " " + A5726HreLote ;
            System.out.println( Gx_msg );
            AV35Control = ">" + Gx_msg ;
            System.out.println( AV35Control );
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04TD4 */
      pr_default.execute(2, new Object[] {AV32Hrelote, AV24EmprCod, Integer.valueOf(AV28Ccstkbar), Byte.valueOf(AV29Ccstkreo), AV30Ccstkpar, AV31Prdnum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
      /* End optimized UPDATE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pccstklote.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apccstklote");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26UsurCod = "" ;
      AV23Station = "" ;
      AV24EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      AV21Fec1 = GXutil.nullDate() ;
      AV22Fec2 = GXutil.nullDate() ;
      P04TD2_A396EmprCod = new String[] {""} ;
      P04TD2_A4492HreBarCod = new int[1] ;
      P04TD2_A4493HreBarReo = new byte[1] ;
      P04TD2_A4494HreBarPar = new String[] {""} ;
      P04TD2_A4495HreNumCie = new byte[1] ;
      P04TD2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P04TD2_n4529HreFecTin = new boolean[] {false} ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      AV36HreFectin = GXutil.nullDate() ;
      AV33Prdnum1 = "" ;
      AV34Prdnum2 = "" ;
      P04TD3_A396EmprCod = new String[] {""} ;
      P04TD3_A4492HreBarCod = new int[1] ;
      P04TD3_A4493HreBarReo = new byte[1] ;
      P04TD3_A4494HreBarPar = new String[] {""} ;
      P04TD3_A4495HreNumCie = new byte[1] ;
      P04TD3_A4558HrePrdNum = new String[] {""} ;
      P04TD3_n4558HrePrdNum = new boolean[] {false} ;
      P04TD3_A5726HreLote = new String[] {""} ;
      P04TD3_n5726HreLote = new boolean[] {false} ;
      P04TD3_A719PrdNum = new String[] {""} ;
      P04TD3_n719PrdNum = new boolean[] {false} ;
      P04TD3_A4559HrePrdDsc = new String[] {""} ;
      P04TD3_n4559HrePrdDsc = new boolean[] {false} ;
      P04TD3_A4545HreLinMaq = new short[1] ;
      P04TD3_A4550HreLinPro = new byte[1] ;
      P04TD3_A4557HreRecLin = new short[1] ;
      A4558HrePrdNum = "" ;
      A5726HreLote = "" ;
      A719PrdNum = "" ;
      A4559HrePrdDsc = "" ;
      AV27HrePrdnum = "" ;
      AV30Ccstkpar = "" ;
      AV31Prdnum = "" ;
      AV32Hrelote = "" ;
      Gx_msg = "" ;
      AV35Control = "" ;
      A5722CCStkLot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apccstklote__default(),
         new Object[] {
             new Object[] {
            P04TD2_A396EmprCod, P04TD2_A4492HreBarCod, P04TD2_A4493HreBarReo, P04TD2_A4494HreBarPar, P04TD2_A4495HreNumCie, P04TD2_A4529HreFecTin, P04TD2_n4529HreFecTin
            }
            , new Object[] {
            P04TD3_A396EmprCod, P04TD3_A4492HreBarCod, P04TD3_A4493HreBarReo, P04TD3_A4494HreBarPar, P04TD3_A4495HreNumCie, P04TD3_A4558HrePrdNum, P04TD3_n4558HrePrdNum, P04TD3_A5726HreLote, P04TD3_n5726HreLote, P04TD3_A719PrdNum,
            P04TD3_n719PrdNum, P04TD3_A4559HrePrdDsc, P04TD3_n4559HrePrdDsc, P04TD3_A4545HreLinMaq, P04TD3_A4550HreLinPro, P04TD3_A4557HreRecLin
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
   private byte A4550HreLinPro ;
   private byte AV29Ccstkreo ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private int AV28Ccstkbar ;
   private String AV26UsurCod ;
   private String AV23Station ;
   private String AV24EmprCod ;
   private String GXv_char1[] ;
   private String AV25EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV33Prdnum1 ;
   private String AV34Prdnum2 ;
   private String A4558HrePrdNum ;
   private String A5726HreLote ;
   private String A719PrdNum ;
   private String A4559HrePrdDsc ;
   private String AV27HrePrdnum ;
   private String AV30Ccstkpar ;
   private String AV31Prdnum ;
   private String AV32Hrelote ;
   private String Gx_msg ;
   private String A5722CCStkLot ;
   private java.util.Date AV21Fec1 ;
   private java.util.Date AV22Fec2 ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV36HreFectin ;
   private boolean n4529HreFecTin ;
   private boolean n4558HrePrdNum ;
   private boolean n5726HreLote ;
   private boolean n719PrdNum ;
   private boolean n4559HrePrdDsc ;
   private boolean returnInSub ;
   private String AV35Control ;
   private IDataStoreProvider pr_default ;
   private String[] P04TD2_A396EmprCod ;
   private int[] P04TD2_A4492HreBarCod ;
   private byte[] P04TD2_A4493HreBarReo ;
   private String[] P04TD2_A4494HreBarPar ;
   private byte[] P04TD2_A4495HreNumCie ;
   private java.util.Date[] P04TD2_A4529HreFecTin ;
   private boolean[] P04TD2_n4529HreFecTin ;
   private String[] P04TD3_A396EmprCod ;
   private int[] P04TD3_A4492HreBarCod ;
   private byte[] P04TD3_A4493HreBarReo ;
   private String[] P04TD3_A4494HreBarPar ;
   private byte[] P04TD3_A4495HreNumCie ;
   private String[] P04TD3_A4558HrePrdNum ;
   private boolean[] P04TD3_n4558HrePrdNum ;
   private String[] P04TD3_A5726HreLote ;
   private boolean[] P04TD3_n5726HreLote ;
   private String[] P04TD3_A719PrdNum ;
   private boolean[] P04TD3_n719PrdNum ;
   private String[] P04TD3_A4559HrePrdDsc ;
   private boolean[] P04TD3_n4559HrePrdDsc ;
   private short[] P04TD3_A4545HreLinMaq ;
   private byte[] P04TD3_A4550HreLinPro ;
   private short[] P04TD3_A4557HreRecLin ;
}

final  class apccstklote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TD2", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreFecTin FROM TXPHISREH WHERE (EmprCod = ? and HreFecTin >= ?) AND (HreFecTin <= ?) ORDER BY EmprCod, HreFecTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04TD3", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HrePrdNum, HreLote, PrdNum, HrePrdDsc, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?) AND (HreLote <> ' ') AND (HrePrdNum >= ?) AND (HrePrdNum <= ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TD4", "UPDATE TXPCCSTKS SET CCStkLot=?  WHERE EmprCod = ? and CCStkBar = ? and CCStkReo = ? and CCStkPar = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

