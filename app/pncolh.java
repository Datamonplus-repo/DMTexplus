package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pncolh extends GXProcedure
{
   public pncolh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pncolh.class ), "" );
   }

   public pncolh( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pncolh.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pncolh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pncolh.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      pncolh.this.AV9Barser = aP2[0];
      this.aP2 = aP2;
      pncolh.this.AV10Barcolnom = aP3[0];
      this.aP3 = aP3;
      pncolh.this.AV11Barcolnum = aP4[0];
      this.aP4 = aP4;
      pncolh.this.AV12BarTipCol = aP5[0];
      this.aP5 = aP5;
      pncolh.this.AV13Msg_h = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Msg_h = " " ;
      AV14N_h = (byte)(0) ;
      /* Using cursor P03CM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Barser, Integer.valueOf(AV11Barcolnum), Byte.valueOf(AV12BarTipCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P03CM2_A831TipColCod[0] ;
         A483ForColNum = P03CM2_A483ForColNum[0] ;
         A494ForSer = P03CM2_A494ForSer[0] ;
         A252CliCod = P03CM2_A252CliCod[0] ;
         A6379ForNomCli2 = P03CM2_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = P03CM2_n6379ForNomCli2[0] ;
         A482ForColNom = P03CM2_A482ForColNom[0] ;
         if ( GXutil.strcmp(AV13Msg_h, " ") == 0 )
         {
            AV13Msg_h = httpContext.getMessage( "Proveedor(es)= ", "") + GXutil.trim( A6379ForNomCli2) ;
         }
         else
         {
            AV13Msg_h += "-" + GXutil.trim( A6379ForNomCli2) ;
         }
         AV14N_h = (byte)(AV14N_h+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13Msg_h, " ") != 0 )
      {
         AV13Msg_h = GXutil.str( AV14N_h, 2, 0) + " " + AV13Msg_h ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pncolh.this.A396EmprCod;
      this.aP1[0] = pncolh.this.AV8Clicod;
      this.aP2[0] = pncolh.this.AV9Barser;
      this.aP3[0] = pncolh.this.AV10Barcolnom;
      this.aP4[0] = pncolh.this.AV11Barcolnum;
      this.aP5[0] = pncolh.this.AV12BarTipCol;
      this.aP6[0] = pncolh.this.AV13Msg_h;
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
      P03CM2_A396EmprCod = new String[] {""} ;
      P03CM2_A831TipColCod = new byte[1] ;
      P03CM2_A483ForColNum = new int[1] ;
      P03CM2_A494ForSer = new String[] {""} ;
      P03CM2_A252CliCod = new int[1] ;
      P03CM2_A6379ForNomCli2 = new String[] {""} ;
      P03CM2_n6379ForNomCli2 = new boolean[] {false} ;
      P03CM2_A482ForColNom = new String[] {""} ;
      A494ForSer = "" ;
      A6379ForNomCli2 = "" ;
      A482ForColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pncolh__default(),
         new Object[] {
             new Object[] {
            P03CM2_A396EmprCod, P03CM2_A831TipColCod, P03CM2_A483ForColNum, P03CM2_A494ForSer, P03CM2_A252CliCod, P03CM2_A6379ForNomCli2, P03CM2_n6379ForNomCli2, P03CM2_A482ForColNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarTipCol ;
   private byte AV14N_h ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV11Barcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV9Barser ;
   private String AV10Barcolnom ;
   private String AV13Msg_h ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A6379ForNomCli2 ;
   private String A482ForColNom ;
   private boolean n6379ForNomCli2 ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03CM2_A396EmprCod ;
   private byte[] P03CM2_A831TipColCod ;
   private int[] P03CM2_A483ForColNum ;
   private String[] P03CM2_A494ForSer ;
   private int[] P03CM2_A252CliCod ;
   private String[] P03CM2_A6379ForNomCli2 ;
   private boolean[] P03CM2_n6379ForNomCli2 ;
   private String[] P03CM2_A482ForColNom ;
}

final  class pncolh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03CM2", "SELECT EmprCod, TipColCod, ForColNum, ForSer, CliCod, ForNomCli2, ForColNom FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ?) AND (ForColNum = ?) AND (TipColCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

