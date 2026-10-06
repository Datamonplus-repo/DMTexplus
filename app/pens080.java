package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens080 extends GXProcedure
{
   public pens080( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens080.class ), "" );
   }

   public pens080( int remoteHandle ,
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
                             byte[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 ,
                             int[] aP9 )
   {
      pens080.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        java.util.Date[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pens080.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens080.this.AV14CliCod = aP1[0];
      this.aP1 = aP1;
      pens080.this.AV15ForSer = aP2[0];
      this.aP2 = aP2;
      pens080.this.AV16ForColNom = aP3[0];
      this.aP3 = aP3;
      pens080.this.AV17ForColNum = aP4[0];
      this.aP4 = aP4;
      pens080.this.AV18TipColCod = aP5[0];
      this.aP5 = aP5;
      pens080.this.AV20Lb_opcion = aP6[0];
      this.aP6 = aP6;
      pens080.this.AV11F_Cformu = aP7[0];
      this.aP7 = aP7;
      pens080.this.AV12ForUltUti = aP8[0];
      this.aP8 = aP8;
      pens080.this.AV19ForNumcol = aP9[0];
      this.aP9 = aP9;
      pens080.this.Gx_msg = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11F_Cformu = (byte)(0) ;
      AV12ForUltUti = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV19ForNumcol = 0 ;
      /* Using cursor P04ZB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV15ForSer, AV16ForColNom, Integer.valueOf(AV17ForColNum), Byte.valueOf(AV18TipColCod), AV20Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P04ZB2_A252CliCod[0] ;
         A494ForSer = P04ZB2_A494ForSer[0] ;
         A482ForColNom = P04ZB2_A482ForColNom[0] ;
         A483ForColNum = P04ZB2_A483ForColNum[0] ;
         A831TipColCod = P04ZB2_A831TipColCod[0] ;
         A3560ForOpcCli = P04ZB2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P04ZB2_n3560ForOpcCli[0] ;
         A496ForUltUti = P04ZB2_A496ForUltUti[0] ;
         n496ForUltUti = P04ZB2_n496ForUltUti[0] ;
         A486ForNumCol = P04ZB2_A486ForNumCol[0] ;
         AV11F_Cformu = (byte)(1) ;
         AV12ForUltUti = A496ForUltUti ;
         AV19ForNumcol = A486ForNumCol ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11F_Cformu == 1 )
      {
         Gx_msg = httpContext.getMessage( " Cor-Opção já existe na biblioteca de cores., Data última utilização ", "") + localUtil.dtoc( AV12ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens080.this.A396EmprCod;
      this.aP1[0] = pens080.this.AV14CliCod;
      this.aP2[0] = pens080.this.AV15ForSer;
      this.aP3[0] = pens080.this.AV16ForColNom;
      this.aP4[0] = pens080.this.AV17ForColNum;
      this.aP5[0] = pens080.this.AV18TipColCod;
      this.aP6[0] = pens080.this.AV20Lb_opcion;
      this.aP7[0] = pens080.this.AV11F_Cformu;
      this.aP8[0] = pens080.this.AV12ForUltUti;
      this.aP9[0] = pens080.this.AV19ForNumcol;
      this.aP10[0] = pens080.this.Gx_msg;
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
      P04ZB2_A396EmprCod = new String[] {""} ;
      P04ZB2_A252CliCod = new int[1] ;
      P04ZB2_A494ForSer = new String[] {""} ;
      P04ZB2_A482ForColNom = new String[] {""} ;
      P04ZB2_A483ForColNum = new int[1] ;
      P04ZB2_A831TipColCod = new byte[1] ;
      P04ZB2_A3560ForOpcCli = new String[] {""} ;
      P04ZB2_n3560ForOpcCli = new boolean[] {false} ;
      P04ZB2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P04ZB2_n496ForUltUti = new boolean[] {false} ;
      P04ZB2_A486ForNumCol = new int[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A3560ForOpcCli = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens080__default(),
         new Object[] {
             new Object[] {
            P04ZB2_A396EmprCod, P04ZB2_A252CliCod, P04ZB2_A494ForSer, P04ZB2_A482ForColNom, P04ZB2_A483ForColNum, P04ZB2_A831TipColCod, P04ZB2_A3560ForOpcCli, P04ZB2_n3560ForOpcCli, P04ZB2_A496ForUltUti, P04ZB2_n496ForUltUti,
            P04ZB2_A486ForNumCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TipColCod ;
   private byte AV11F_Cformu ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV14CliCod ;
   private int AV17ForColNum ;
   private int AV19ForNumcol ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private String A396EmprCod ;
   private String AV15ForSer ;
   private String AV16ForColNom ;
   private String AV20Lb_opcion ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A3560ForOpcCli ;
   private java.util.Date AV12ForUltUti ;
   private java.util.Date A496ForUltUti ;
   private boolean n3560ForOpcCli ;
   private boolean n496ForUltUti ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private java.util.Date[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZB2_A396EmprCod ;
   private int[] P04ZB2_A252CliCod ;
   private String[] P04ZB2_A494ForSer ;
   private String[] P04ZB2_A482ForColNom ;
   private int[] P04ZB2_A483ForColNum ;
   private byte[] P04ZB2_A831TipColCod ;
   private String[] P04ZB2_A3560ForOpcCli ;
   private boolean[] P04ZB2_n3560ForOpcCli ;
   private java.util.Date[] P04ZB2_A496ForUltUti ;
   private boolean[] P04ZB2_n496ForUltUti ;
   private int[] P04ZB2_A486ForNumCol ;
}

final  class pens080__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZB2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForOpcCli, ForUltUti, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForOpcCli = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForOpcCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
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
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

