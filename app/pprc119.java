package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc119 extends GXProcedure
{
   public pprc119( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc119.class ), "" );
   }

   public pprc119( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprc119.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc119.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc119.this.AV8Prdnum = aP1[0];
      this.aP1 = aP1;
      pprc119.this.AV11Prdnom = aP2[0];
      this.aP2 = aP2;
      pprc119.this.AV9Tb1_cod = aP3[0];
      this.aP3 = aP3;
      pprc119.this.AV14Tb1_Dsc = aP4[0];
      this.aP4 = aP4;
      pprc119.this.AV12Usurcod = aP5[0];
      this.aP5 = aP5;
      pprc119.this.AV13station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCdnEnc

      */
      A719PrdNum = AV8Prdnum ;
      A9713Tb1_Cod = AV9Tb1_cod ;
      /* Using cursor P05LG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCdnEnc");
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
      AV10inc_obs = httpContext.getMessage( "Alta Caderno Encargos ", "") + GXutil.str( AV9Tb1_cod, 4, 0) + " " + GXutil.trim( AV14Tb1_Dsc) ;
      AV10inc_obs += httpContext.getMessage( "Producto ", "") + AV8Prdnum + " " + AV11Prdnom ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV17Pgmname, AV12Usurcod, AV13station, AV10inc_obs, 99999999, (byte)(0), " ") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc119.this.A396EmprCod;
      this.aP1[0] = pprc119.this.AV8Prdnum;
      this.aP2[0] = pprc119.this.AV11Prdnom;
      this.aP3[0] = pprc119.this.AV9Tb1_cod;
      this.aP4[0] = pprc119.this.AV14Tb1_Dsc;
      this.aP5[0] = pprc119.this.AV12Usurcod;
      this.aP6[0] = pprc119.this.AV13station;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A719PrdNum = "" ;
      Gx_emsg = "" ;
      AV10inc_obs = "" ;
      AV17Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc119__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      AV17Pgmname = "PPrc119" ;
      /* GeneXus formulas. */
      AV17Pgmname = "PPrc119" ;
      Gx_err = (short)(0) ;
   }

   private short AV9Tb1_cod ;
   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private int GX_INS1732 ;
   private String A396EmprCod ;
   private String AV8Prdnum ;
   private String AV11Prdnom ;
   private String AV14Tb1_Dsc ;
   private String AV12Usurcod ;
   private String AV13station ;
   private String A719PrdNum ;
   private String Gx_emsg ;
   private String AV17Pgmname ;
   private String AV10inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pprc119__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05LG2", "INSERT INTO TXPCdnEnc(EmprCod, PrdNum, Tb1_Cod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCdnEnc")
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

