package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcccadernoencargos extends GXProcedure
{
   public pcccadernoencargos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcccadernoencargos.class ), "" );
   }

   public pcccadernoencargos( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      pcccadernoencargos.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pcccadernoencargos.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      pcccadernoencargos.this.AV9Clicod = aP1[0];
      this.aP1 = aP1;
      pcccadernoencargos.this.AV10Tb1_cod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCCCnoE

      */
      A396EmprCod = AV8Emprcod ;
      A252CliCod = AV9Clicod ;
      A9713Tb1_Cod = AV10Tb1_cod ;
      A11736CCArtCod = " " ;
      /* Using cursor P05VS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCnoE");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCCno1

      */
      A396EmprCod = AV8Emprcod ;
      A252CliCod = AV9Clicod ;
      A9713Tb1_Cod = AV10Tb1_cod ;
      A11736CCArtCod = " " ;
      A11748TipArtiId = (short)(0) ;
      /* Using cursor P05VS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno1");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCCno3

      */
      A396EmprCod = AV8Emprcod ;
      A252CliCod = AV9Clicod ;
      A9713Tb1_Cod = AV10Tb1_cod ;
      A11736CCArtCod = " " ;
      A11748TipArtiId = (short)(0) ;
      A11737CCColNom = " " ;
      A11738CCColNum = 0 ;
      A11749CCCTc = (byte)(0) ;
      /* Using cursor P05VS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCCno4

      */
      A396EmprCod = AV8Emprcod ;
      A252CliCod = AV9Clicod ;
      A9713Tb1_Cod = AV10Tb1_cod ;
      A11736CCArtCod = " " ;
      A11748TipArtiId = (short)(0) ;
      A11737CCColNom = " " ;
      A11738CCColNum = 0 ;
      A11749CCCTc = (byte)(0) ;
      A11750IntId = (short)(0) ;
      /* Using cursor P05VS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcccadernoencargos.this.AV8Emprcod;
      this.aP1[0] = pcccadernoencargos.this.AV9Clicod;
      this.aP2[0] = pcccadernoencargos.this.AV10Tb1_cod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcccadernoencargos");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A11736CCArtCod = "" ;
      Gx_emsg = "" ;
      A11737CCColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcccadernoencargos__default(),
         new Object[] {
             new Object[] {
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

   private byte A11749CCCTc ;
   private short AV10Tb1_cod ;
   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private short A11748TipArtiId ;
   private short A11750IntId ;
   private int AV9Clicod ;
   private int GX_INS1642 ;
   private int A252CliCod ;
   private int GX_INS1648 ;
   private int GX_INS1649 ;
   private int A11738CCColNum ;
   private int GX_INS1650 ;
   private String AV8Emprcod ;
   private String A396EmprCod ;
   private String A11736CCArtCod ;
   private String Gx_emsg ;
   private String A11737CCColNom ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pcccadernoencargos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05VS2", "INSERT INTO TXPCCCnoE(EmprCod, CliCod, Tb1_Cod, CCArtCod) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCnoE")
         ,new UpdateCursor("P05VS3", "INSERT INTO TXPCCCno1(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno1")
         ,new UpdateCursor("P05VS4", "INSERT INTO TXPCCCno3(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno3")
         ,new UpdateCursor("P05VS5", "INSERT INTO TXPCCCno4(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno4")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
      }
   }

}

