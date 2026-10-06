package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdsto2 extends GXProcedure
{
   public phdsto2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdsto2.class ), "" );
   }

   public phdsto2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      phdsto2.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      phdsto2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdsto2.this.AV9Barcod = aP1[0];
      this.aP1 = aP1;
      phdsto2.this.AV10Barcodreo = aP2[0];
      this.aP2 = aP2;
      phdsto2.this.AV11Barcodpar = aP3[0];
      this.aP3 = aP3;
      phdsto2.this.AV8Stp_mot = aP4[0];
      this.aP4 = aP4;
      phdsto2.this.AV13Usurcod = aP5[0];
      this.aP5 = aP5;
      phdsto2.this.AV14Station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Stp_ultl = (short)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P04202 */
      pr_default.execute(0, new Object[] {AV14Station, AV13Usurcod, AV8Stp_mot, A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdsto2.this.A396EmprCod;
      this.aP1[0] = phdsto2.this.AV9Barcod;
      this.aP2[0] = phdsto2.this.AV10Barcodreo;
      this.aP3[0] = phdsto2.this.AV11Barcodpar;
      this.aP4[0] = phdsto2.this.AV8Stp_mot;
      this.aP5[0] = phdsto2.this.AV13Usurcod;
      this.aP6[0] = phdsto2.this.AV14Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdsto2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A11689Stp_TermAc = "" ;
      A11688Stp_UsuAct = "" ;
      A10757Stp_MotA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdsto2__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private short AV12Stp_ultl ;
   private short Gx_err ;
   private int AV9Barcod ;
   private String A396EmprCod ;
   private String AV11Barcodpar ;
   private String AV13Usurcod ;
   private String AV14Station ;
   private String A11689Stp_TermAc ;
   private String A11688Stp_UsuAct ;
   private String AV8Stp_mot ;
   private String A10757Stp_MotA ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class phdsto2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04202", "UPDATE TXPHDSTO1 SET Stp_TermAc=?, Stp_UsuAct=?, Stp_MotA=?, Stp_DiaA=(SYSDATE), Stp_Est=2  WHERE (EmprCod = ? and Stp_hdr = ? and Stp_r = ? and Stp_p = ?) AND (Stp_Est = 1)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDSTO1")
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setVarchar(3, (String)parms[2], 300, false);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

