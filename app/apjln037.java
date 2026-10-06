package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln037 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln037 pgm = new apjln037 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln037( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln037.class ), "" );
   }

   public apjln037( int remoteHandle ,
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
      AV17Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV18EmprCod ;
      GXv_char2[0] = AV19EmprNom ;
      GXv_char3[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char1, GXv_char2, GXv_char3) ;
      apjln037.this.AV18EmprCod = GXv_char1[0] ;
      apjln037.this.AV19EmprNom = GXv_char2[0] ;
      apjln037.this.AV20UsurCod = GXv_char3[0] ;
      AV24Num_rgtos = 0 ;
      AV37Total_rgt = 0 ;
      /* Using cursor P01K22 */
      pr_default.execute(0, new Object[] {AV18EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P01K22_A396EmprCod[0] ;
         A454FacSer = P01K22_A454FacSer[0] ;
         A3397FacFasCod = P01K22_A3397FacFasCod[0] ;
         A1296FacBarPar = P01K22_A1296FacBarPar[0] ;
         A1295FacBarReo = P01K22_A1295FacBarReo[0] ;
         A1294FacBarCod = P01K22_A1294FacBarCod[0] ;
         A430FacCod = P01K22_A430FacCod[0] ;
         A446FacLin = P01K22_A446FacLin[0] ;
         if ( GXutil.strcmp(A3397FacFasCod, GXutil.space( (short)(8))) == 0 )
         {
            if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
            {
               AV24Num_rgtos = (int)(AV24Num_rgtos+1) ;
               AV37Total_rgt = (int)(AV37Total_rgt+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV24Num_rgtos = 0 ;
      /* Using cursor P01K23 */
      pr_default.execute(1, new Object[] {AV18EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P01K23_A396EmprCod[0] ;
         A454FacSer = P01K23_A454FacSer[0] ;
         A3397FacFasCod = P01K23_A3397FacFasCod[0] ;
         A3097FacTipPro = P01K23_A3097FacTipPro[0] ;
         A3878FacColNom = P01K23_A3878FacColNom[0] ;
         A3879FocColNum = P01K23_A3879FocColNum[0] ;
         A3880FacTipColC = P01K23_A3880FacTipColC[0] ;
         A3881FacNomCol = P01K23_A3881FacNomCol[0] ;
         A3882FacNumCol = P01K23_A3882FacNumCol[0] ;
         A1296FacBarPar = P01K23_A1296FacBarPar[0] ;
         A1295FacBarReo = P01K23_A1295FacBarReo[0] ;
         A1294FacBarCod = P01K23_A1294FacBarCod[0] ;
         A430FacCod = P01K23_A430FacCod[0] ;
         A446FacLin = P01K23_A446FacLin[0] ;
         if ( GXutil.strcmp(A3397FacFasCod, GXutil.space( (short)(8))) == 0 )
         {
            if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
            {
               AV36Porcent = (short)(0) ;
               if ( AV37Total_rgt > 0 )
               {
                  AV36Porcent = (short)((AV24Num_rgtos/ (double) (AV37Total_rgt))*100) ;
               }
               AV24Num_rgtos = (int)(AV24Num_rgtos+1) ;
               AV21BarCod = A1294FacBarCod ;
               AV22BarCodPar = A1296FacBarPar ;
               AV23BarCodReo = A1295FacBarReo ;
               if ( GXutil.strcmp(A3397FacFasCod, GXutil.space( (short)(8))) == 0 )
               {
                  /* Execute user subroutine: 'BARCAD' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV31Flag_act == 1 )
                  {
                     A3097FacTipPro = AV41BarTipDis ;
                     A3878FacColNom = AV38BarColNom ;
                     A3879FocColNum = AV39BarColNum ;
                     A3880FacTipColC = AV40BarTipCol ;
                     A3881FacNomCol = AV42BarNomCli ;
                     A3882FacNumCol = AV43BarNumCli ;
                  }
               }
               /* Using cursor P01K24 */
               pr_default.execute(2, new Object[] {A3097FacTipPro, A3878FacColNom, Integer.valueOf(A3879FocColNum), Byte.valueOf(A3880FacTipColC), A3881FacNomCol, Integer.valueOf(A3882FacNumCol), A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV38BarColNom = GXutil.space( (short)(13)) ;
      AV39BarColNum = 0 ;
      AV40BarTipCol = (byte)(0) ;
      AV41BarTipDis = GXutil.space( (short)(1)) ;
      AV42BarNomCli = GXutil.space( (short)(13)) ;
      AV43BarNumCli = 0 ;
      AV31Flag_act = (byte)(0) ;
      /* Using cursor P01K25 */
      pr_default.execute(3, new Object[] {AV18EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV23BarCodReo), AV22BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P01K25_A130BarCodPar[0] ;
         A132BarCodReo = P01K25_A132BarCodReo[0] ;
         A129BarCod = P01K25_A129BarCod[0] ;
         A396EmprCod = P01K25_A396EmprCod[0] ;
         A135BarColNom = P01K25_A135BarColNom[0] ;
         A136BarColNum = P01K25_A136BarColNum[0] ;
         A218BarTipCol = P01K25_A218BarTipCol[0] ;
         A2010BarTipDis = P01K25_A2010BarTipDis[0] ;
         A1234BarNomCli = P01K25_A1234BarNomCli[0] ;
         A1235BarNumCli = P01K25_A1235BarNumCli[0] ;
         AV38BarColNom = A135BarColNom ;
         AV39BarColNum = A136BarColNum ;
         AV40BarTipCol = A218BarTipCol ;
         AV41BarTipDis = A2010BarTipDis ;
         AV42BarNomCli = A1234BarNomCli ;
         AV43BarNumCli = A1235BarNumCli ;
         AV31Flag_act = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln037.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln037");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Station = "" ;
      AV18EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV20UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P01K22_A396EmprCod = new String[] {""} ;
      P01K22_A454FacSer = new String[] {""} ;
      P01K22_A3397FacFasCod = new String[] {""} ;
      P01K22_A1296FacBarPar = new String[] {""} ;
      P01K22_A1295FacBarReo = new byte[1] ;
      P01K22_A1294FacBarCod = new int[1] ;
      P01K22_A430FacCod = new int[1] ;
      P01K22_A446FacLin = new int[1] ;
      A396EmprCod = "" ;
      A454FacSer = "" ;
      A3397FacFasCod = "" ;
      A1296FacBarPar = "" ;
      P01K23_A396EmprCod = new String[] {""} ;
      P01K23_A454FacSer = new String[] {""} ;
      P01K23_A3397FacFasCod = new String[] {""} ;
      P01K23_A3097FacTipPro = new String[] {""} ;
      P01K23_A3878FacColNom = new String[] {""} ;
      P01K23_A3879FocColNum = new int[1] ;
      P01K23_A3880FacTipColC = new byte[1] ;
      P01K23_A3881FacNomCol = new String[] {""} ;
      P01K23_A3882FacNumCol = new int[1] ;
      P01K23_A1296FacBarPar = new String[] {""} ;
      P01K23_A1295FacBarReo = new byte[1] ;
      P01K23_A1294FacBarCod = new int[1] ;
      P01K23_A430FacCod = new int[1] ;
      P01K23_A446FacLin = new int[1] ;
      A3097FacTipPro = "" ;
      A3878FacColNom = "" ;
      A3881FacNomCol = "" ;
      AV22BarCodPar = "" ;
      AV41BarTipDis = "" ;
      AV38BarColNom = "" ;
      AV42BarNomCli = "" ;
      P01K25_A130BarCodPar = new String[] {""} ;
      P01K25_A132BarCodReo = new byte[1] ;
      P01K25_A129BarCod = new int[1] ;
      P01K25_A396EmprCod = new String[] {""} ;
      P01K25_A135BarColNom = new String[] {""} ;
      P01K25_A136BarColNum = new int[1] ;
      P01K25_A218BarTipCol = new byte[1] ;
      P01K25_A2010BarTipDis = new String[] {""} ;
      P01K25_A1234BarNomCli = new String[] {""} ;
      P01K25_A1235BarNumCli = new int[1] ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A1234BarNomCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln037__default(),
         new Object[] {
             new Object[] {
            P01K22_A396EmprCod, P01K22_A454FacSer, P01K22_A3397FacFasCod, P01K22_A1296FacBarPar, P01K22_A1295FacBarReo, P01K22_A1294FacBarCod, P01K22_A430FacCod, P01K22_A446FacLin
            }
            , new Object[] {
            P01K23_A396EmprCod, P01K23_A454FacSer, P01K23_A3397FacFasCod, P01K23_A3097FacTipPro, P01K23_A3878FacColNom, P01K23_A3879FocColNum, P01K23_A3880FacTipColC, P01K23_A3881FacNomCol, P01K23_A3882FacNumCol, P01K23_A1296FacBarPar,
            P01K23_A1295FacBarReo, P01K23_A1294FacBarCod, P01K23_A430FacCod, P01K23_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01K25_A130BarCodPar, P01K25_A132BarCodReo, P01K25_A129BarCod, P01K25_A396EmprCod, P01K25_A135BarColNom, P01K25_A136BarColNum, P01K25_A218BarTipCol, P01K25_A2010BarTipDis, P01K25_A1234BarNomCli, P01K25_A1235BarNumCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1295FacBarReo ;
   private byte A3880FacTipColC ;
   private byte AV23BarCodReo ;
   private byte AV31Flag_act ;
   private byte AV40BarTipCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private short AV36Porcent ;
   private short Gx_err ;
   private int AV24Num_rgtos ;
   private int AV37Total_rgt ;
   private int A1294FacBarCod ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A3879FocColNum ;
   private int A3882FacNumCol ;
   private int AV21BarCod ;
   private int AV39BarColNum ;
   private int AV43BarNumCli ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private String AV17Station ;
   private String AV18EmprCod ;
   private String GXv_char1[] ;
   private String AV19EmprNom ;
   private String GXv_char2[] ;
   private String AV20UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A454FacSer ;
   private String A3397FacFasCod ;
   private String A1296FacBarPar ;
   private String A3097FacTipPro ;
   private String A3878FacColNom ;
   private String A3881FacNomCol ;
   private String AV22BarCodPar ;
   private String AV41BarTipDis ;
   private String AV38BarColNom ;
   private String AV42BarNomCli ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A1234BarNomCli ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P01K22_A396EmprCod ;
   private String[] P01K22_A454FacSer ;
   private String[] P01K22_A3397FacFasCod ;
   private String[] P01K22_A1296FacBarPar ;
   private byte[] P01K22_A1295FacBarReo ;
   private int[] P01K22_A1294FacBarCod ;
   private int[] P01K22_A430FacCod ;
   private int[] P01K22_A446FacLin ;
   private String[] P01K23_A396EmprCod ;
   private String[] P01K23_A454FacSer ;
   private String[] P01K23_A3397FacFasCod ;
   private String[] P01K23_A3097FacTipPro ;
   private String[] P01K23_A3878FacColNom ;
   private int[] P01K23_A3879FocColNum ;
   private byte[] P01K23_A3880FacTipColC ;
   private String[] P01K23_A3881FacNomCol ;
   private int[] P01K23_A3882FacNumCol ;
   private String[] P01K23_A1296FacBarPar ;
   private byte[] P01K23_A1295FacBarReo ;
   private int[] P01K23_A1294FacBarCod ;
   private int[] P01K23_A430FacCod ;
   private int[] P01K23_A446FacLin ;
   private String[] P01K25_A130BarCodPar ;
   private byte[] P01K25_A132BarCodReo ;
   private int[] P01K25_A129BarCod ;
   private String[] P01K25_A396EmprCod ;
   private String[] P01K25_A135BarColNom ;
   private int[] P01K25_A136BarColNum ;
   private byte[] P01K25_A218BarTipCol ;
   private String[] P01K25_A2010BarTipDis ;
   private String[] P01K25_A1234BarNomCli ;
   private int[] P01K25_A1235BarNumCli ;
}

final  class apjln037__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01K22", "SELECT EmprCod, FacSer, FacFasCod, FacBarPar, FacBarReo, FacBarCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? ORDER BY EmprCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01K23", "SELECT EmprCod, FacSer, FacFasCod, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacBarPar, FacBarReo, FacBarCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? ORDER BY EmprCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01K24", "UPDATE TXPLFAVEN SET FacTipPro=?, FacColNom=?, FocColNum=?, FacTipColC=?, FacNomCol=?, FacNumCol=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P01K25", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarColNom, BarColNum, BarTipCol, BarTipDis, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

