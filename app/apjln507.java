package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln507 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln507 pgm = new apjln507 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln507( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln507.class ), "" );
   }

   public apjln507( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Control BARCAD-Int_Item2....", "") );
      AV19Num_r = 0 ;
      /* Using cursor P03A82 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P03A82_A213BarSit[0] ;
         A396EmprCod = P03A82_A396EmprCod[0] ;
         A129BarCod = P03A82_A129BarCod[0] ;
         A132BarCodReo = P03A82_A132BarCodReo[0] ;
         A130BarCodPar = P03A82_A130BarCodPar[0] ;
         A2826BarNumLot = P03A82_A2826BarNumLot[0] ;
         A2752BarNumTex1 = P03A82_A2752BarNumTex1[0] ;
         A148BarEstReo = P03A82_A148BarEstReo[0] ;
         AV14Emprcod = A396EmprCod ;
         AV16Barcod = A129BarCod ;
         AV17Barcodreo = A132BarCodReo ;
         AV18Barcodpar = A130BarCodPar ;
         AV13BarNumLot = A2826BarNumLot ;
         /* Execute user subroutine: 'OTINT' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A2752BarNumTex1 = AV15Int_item2 ;
         if ( A148BarEstReo == 1 )
         {
            A2752BarNumTex1 = (byte)(4) ;
            AV15Int_item2 = (byte)(4) ;
         }
         /* Execute user subroutine: 'LHIPRO' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19Num_r = (int)(AV19Num_r+1) ;
         Gx_msg = httpContext.getMessage( "OT=", "") + GXutil.str( A2826BarNumLot, 8, 0) + " " + GXutil.str( AV19Num_r, 6, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P03A83 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A2752BarNumTex1), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Control BARCAD-Int_Item2....", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'OTINT' Routine */
      returnInSub = false ;
      AV15Int_item2 = (byte)(0) ;
      /* Using cursor P03A84 */
      pr_default.execute(2, new Object[] {AV14Emprcod, Integer.valueOf(AV13BarNumLot)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A7843Int_Num = P03A84_A7843Int_Num[0] ;
         A396EmprCod = P03A84_A396EmprCod[0] ;
         A8421Int_item2 = P03A84_A8421Int_item2[0] ;
         n8421Int_item2 = P03A84_n8421Int_item2[0] ;
         AV15Int_item2 = A8421Int_item2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'LHIPRO' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03A85 */
      byte AV15Int_item26819Aux;
      AV15Int_item26819Aux = AV15Int_item2 ;
      pr_default.execute(3, new Object[] {Byte.valueOf(AV15Int_item26819Aux), AV14Emprcod, Integer.valueOf(AV16Barcod), Byte.valueOf(AV17Barcodreo), AV18Barcodpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
      /* End optimized UPDATE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln507.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln507");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P03A82_A213BarSit = new byte[1] ;
      P03A82_A396EmprCod = new String[] {""} ;
      P03A82_A129BarCod = new int[1] ;
      P03A82_A132BarCodReo = new byte[1] ;
      P03A82_A130BarCodPar = new String[] {""} ;
      P03A82_A2826BarNumLot = new int[1] ;
      P03A82_A2752BarNumTex1 = new byte[1] ;
      P03A82_A148BarEstReo = new byte[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV14Emprcod = "" ;
      AV18Barcodpar = "" ;
      Gx_msg = "" ;
      P03A84_A7843Int_Num = new int[1] ;
      P03A84_A396EmprCod = new String[] {""} ;
      P03A84_A8421Int_item2 = new byte[1] ;
      P03A84_n8421Int_item2 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln507__default(),
         new Object[] {
             new Object[] {
            P03A82_A213BarSit, P03A82_A396EmprCod, P03A82_A129BarCod, P03A82_A132BarCodReo, P03A82_A130BarCodPar, P03A82_A2826BarNumLot, P03A82_A2752BarNumTex1, P03A82_A148BarEstReo
            }
            , new Object[] {
            }
            , new Object[] {
            P03A84_A7843Int_Num, P03A84_A396EmprCod, P03A84_A8421Int_item2, P03A84_n8421Int_item2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A2752BarNumTex1 ;
   private byte A148BarEstReo ;
   private byte AV17Barcodreo ;
   private byte AV15Int_item2 ;
   private byte A8421Int_item2 ;
   private byte A6819HisproNPd ;
   private short Gx_err ;
   private int AV19Num_r ;
   private int A129BarCod ;
   private int A2826BarNumLot ;
   private int AV16Barcod ;
   private int AV13BarNumLot ;
   private int A7843Int_Num ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14Emprcod ;
   private String AV18Barcodpar ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private boolean n8421Int_item2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03A82_A213BarSit ;
   private String[] P03A82_A396EmprCod ;
   private int[] P03A82_A129BarCod ;
   private byte[] P03A82_A132BarCodReo ;
   private String[] P03A82_A130BarCodPar ;
   private int[] P03A82_A2826BarNumLot ;
   private byte[] P03A82_A2752BarNumTex1 ;
   private byte[] P03A82_A148BarEstReo ;
   private int[] P03A84_A7843Int_Num ;
   private String[] P03A84_A396EmprCod ;
   private byte[] P03A84_A8421Int_item2 ;
   private boolean[] P03A84_n8421Int_item2 ;
}

final  class apjln507__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03A82", "SELECT BarSit, EmprCod, BarCod, BarCodReo, BarCodPar, BarNumLot, BarNumTex1, BarEstReo FROM TXPBARCAD WHERE (EmprCod = '001') AND (BarSit <= 9) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03A83", "UPDATE TXPBARCAD SET BarNumTex1=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P03A84", "SELECT Int_Num, EmprCod, Int_item2 FROM TXPOTINT WHERE EmprCod = ? and Int_Num = ? ORDER BY EmprCod, Int_Num ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03A85", "UPDATE TXPLHIPRO SET HisproNPd=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

