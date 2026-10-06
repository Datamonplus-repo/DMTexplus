package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelifor extends GXProcedure
{
   public pelifor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelifor.class ), "" );
   }

   public pelifor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 )
   {
      pelifor.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 )
   {
      pelifor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelifor.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pelifor.this.AV16ForSer = aP2[0];
      this.aP2 = aP2;
      pelifor.this.AV17ForColNom = aP3[0];
      this.aP3 = aP3;
      pelifor.this.AV18ForColNum = aP4[0];
      this.aP4 = aP4;
      pelifor.this.AV19TipColCod = aP5[0];
      this.aP5 = aP5;
      pelifor.this.AV20ForNumCol = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV20ForNumCol ;
      GXv_int3[0] = AV21Contador ;
      new app.formulaciontinte.pelifo1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
      pelifor.this.A396EmprCod = GXv_char1[0] ;
      pelifor.this.AV20ForNumCol = GXv_int2[0] ;
      pelifor.this.AV21Contador = GXv_int3[0] ;
      /* Using cursor P00AA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P00AA2_A831TipColCod[0] ;
         A483ForColNum = P00AA2_A483ForColNum[0] ;
         A482ForColNom = P00AA2_A482ForColNom[0] ;
         A494ForSer = P00AA2_A494ForSer[0] ;
         A252CliCod = P00AA2_A252CliCod[0] ;
         A486ForNumCol = P00AA2_A486ForNumCol[0] ;
         /* Optimized DELETE. */
         /* Using cursor P00AA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00AA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSCAB");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00AA5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00AA6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00AA7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORLIS");
         /* End optimized DELETE. */
         if ( AV21Contador == 1 )
         {
            AV22EmprCod = A396EmprCod ;
            AV23NumFor = A486ForNumCol ;
            /* Execute user subroutine: 'BORRAR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Using cursor P00AA8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BORRAR' Routine */
      returnInSub = false ;
      /* Using cursor P00AA9 */
      pr_default.execute(7, new Object[] {AV22EmprCod, Integer.valueOf(AV20ForNumCol)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A486ForNumCol = P00AA9_A486ForNumCol[0] ;
         A310ColUltLin = P00AA9_A310ColUltLin[0] ;
         /* Optimized DELETE. */
         /* Using cursor P00AA10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00AA11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
         /* End optimized DELETE. */
         /* Using cursor P00AA12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelifor.this.A396EmprCod;
      this.aP1[0] = pelifor.this.AV15CliCod;
      this.aP2[0] = pelifor.this.AV16ForSer;
      this.aP3[0] = pelifor.this.AV17ForColNom;
      this.aP4[0] = pelifor.this.AV18ForColNum;
      this.aP5[0] = pelifor.this.AV19TipColCod;
      this.aP6[0] = pelifor.this.AV20ForNumCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelifor");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P00AA2_A396EmprCod = new String[] {""} ;
      P00AA2_A831TipColCod = new byte[1] ;
      P00AA2_A483ForColNum = new int[1] ;
      P00AA2_A482ForColNom = new String[] {""} ;
      P00AA2_A494ForSer = new String[] {""} ;
      P00AA2_A252CliCod = new int[1] ;
      P00AA2_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV22EmprCod = "" ;
      P00AA9_A486ForNumCol = new int[1] ;
      P00AA9_A396EmprCod = new String[] {""} ;
      P00AA9_A310ColUltLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelifor__default(),
         new Object[] {
             new Object[] {
            P00AA2_A396EmprCod, P00AA2_A831TipColCod, P00AA2_A483ForColNum, P00AA2_A482ForColNom, P00AA2_A494ForSer, P00AA2_A252CliCod, P00AA2_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00AA9_A486ForNumCol, P00AA9_A396EmprCod, P00AA9_A310ColUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte AV21Contador ;
   private byte GXv_int3[] ;
   private byte A831TipColCod ;
   private short A310ColUltLin ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int AV20ForNumCol ;
   private int GXv_int2[] ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int AV23NumFor ;
   private String A396EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV22EmprCod ;
   private boolean returnInSub ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00AA2_A396EmprCod ;
   private byte[] P00AA2_A831TipColCod ;
   private int[] P00AA2_A483ForColNum ;
   private String[] P00AA2_A482ForColNom ;
   private String[] P00AA2_A494ForSer ;
   private int[] P00AA2_A252CliCod ;
   private int[] P00AA2_A486ForNumCol ;
   private int[] P00AA9_A486ForNumCol ;
   private String[] P00AA9_A396EmprCod ;
   private short[] P00AA9_A310ColUltLin ;
}

final  class pelifor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00AA2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AA3", "DELETE FROM TXPLOBFOR  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
         ,new UpdateCursor("P00AA4", "DELETE FROM TXPENSCAB  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENSCAB")
         ,new UpdateCursor("P00AA5", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P00AA6", "DELETE FROM TXPFORMQP  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORMQP")
         ,new UpdateCursor("P00AA7", "DELETE FROM TXPFORLIS  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORLIS")
         ,new UpdateCursor("P00AA8", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P00AA9", "SELECT ForNumCol, EmprCod, ColUltLin FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AA10", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new UpdateCursor("P00AA11", "DELETE FROM TXPLPRFOR  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new UpdateCursor("P00AA12", "DELETE FROM TXPCDFORM  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

