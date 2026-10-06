package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens011 extends GXProcedure
{
   public pens011( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens011.class ), "" );
   }

   public pens011( int remoteHandle ,
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
                             byte[] aP6 ,
                             java.util.Date[] aP7 ,
                             int[] aP8 )
   {
      pens011.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        java.util.Date[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             java.util.Date[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 )
   {
      pens011.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens011.this.AV14CliCod = aP1[0];
      this.aP1 = aP1;
      pens011.this.AV15ForSer = aP2[0];
      this.aP2 = aP2;
      pens011.this.AV16ForColNom = aP3[0];
      this.aP3 = aP3;
      pens011.this.AV17ForColNum = aP4[0];
      this.aP4 = aP4;
      pens011.this.AV18TipColCod = aP5[0];
      this.aP5 = aP5;
      pens011.this.AV11F_Cformu = aP6[0];
      this.aP6 = aP6;
      pens011.this.AV12ForUltUti = aP7[0];
      this.aP7 = aP7;
      pens011.this.AV19ForNumcol = aP8[0];
      this.aP8 = aP8;
      pens011.this.Gx_msg = aP9[0];
      this.aP9 = aP9;
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
      /* Using cursor P01TC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV15ForSer, AV16ForColNom, Integer.valueOf(AV17ForColNum), Byte.valueOf(AV18TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P01TC2_A831TipColCod[0] ;
         A483ForColNum = P01TC2_A483ForColNum[0] ;
         A482ForColNom = P01TC2_A482ForColNom[0] ;
         A494ForSer = P01TC2_A494ForSer[0] ;
         A252CliCod = P01TC2_A252CliCod[0] ;
         A496ForUltUti = P01TC2_A496ForUltUti[0] ;
         n496ForUltUti = P01TC2_n496ForUltUti[0] ;
         A486ForNumCol = P01TC2_A486ForNumCol[0] ;
         AV11F_Cformu = (byte)(1) ;
         AV12ForUltUti = A496ForUltUti ;
         AV19ForNumcol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11F_Cformu == 1 )
      {
         Gx_msg = httpContext.getMessage( " Color Existente en COLORTECA, Fecha Ultima Utilizacion ", "") + localUtil.dtoc( AV12ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens011.this.A396EmprCod;
      this.aP1[0] = pens011.this.AV14CliCod;
      this.aP2[0] = pens011.this.AV15ForSer;
      this.aP3[0] = pens011.this.AV16ForColNom;
      this.aP4[0] = pens011.this.AV17ForColNum;
      this.aP5[0] = pens011.this.AV18TipColCod;
      this.aP6[0] = pens011.this.AV11F_Cformu;
      this.aP7[0] = pens011.this.AV12ForUltUti;
      this.aP8[0] = pens011.this.AV19ForNumcol;
      this.aP9[0] = pens011.this.Gx_msg;
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
      P01TC2_A396EmprCod = new String[] {""} ;
      P01TC2_A831TipColCod = new byte[1] ;
      P01TC2_A483ForColNum = new int[1] ;
      P01TC2_A482ForColNom = new String[] {""} ;
      P01TC2_A494ForSer = new String[] {""} ;
      P01TC2_A252CliCod = new int[1] ;
      P01TC2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P01TC2_n496ForUltUti = new boolean[] {false} ;
      P01TC2_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens011__default(),
         new Object[] {
             new Object[] {
            P01TC2_A396EmprCod, P01TC2_A831TipColCod, P01TC2_A483ForColNum, P01TC2_A482ForColNom, P01TC2_A494ForSer, P01TC2_A252CliCod, P01TC2_A496ForUltUti, P01TC2_n496ForUltUti, P01TC2_A486ForNumCol
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
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private String A396EmprCod ;
   private String AV15ForSer ;
   private String AV16ForColNom ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private java.util.Date AV12ForUltUti ;
   private java.util.Date A496ForUltUti ;
   private boolean n496ForUltUti ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private java.util.Date[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P01TC2_A396EmprCod ;
   private byte[] P01TC2_A831TipColCod ;
   private int[] P01TC2_A483ForColNum ;
   private String[] P01TC2_A482ForColNom ;
   private String[] P01TC2_A494ForSer ;
   private int[] P01TC2_A252CliCod ;
   private java.util.Date[] P01TC2_A496ForUltUti ;
   private boolean[] P01TC2_n496ForUltUti ;
   private int[] P01TC2_A486ForNumCol ;
}

final  class pens011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TC2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForUltUti, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
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
      }
   }

}

