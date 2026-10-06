package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodfor extends GXProcedure
{
   public pmodfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodfor.class ), "" );
   }

   public pmodfor( int remoteHandle ,
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
                             int[] aP7 )
   {
      pmodfor.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 )
   {
      pmodfor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodfor.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmodfor.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pmodfor.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pmodfor.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pmodfor.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pmodfor.this.AV15ForCon = aP6[0];
      this.aP6 = aP6;
      pmodfor.this.AV16NumColFor = aP7[0];
      this.aP7 = aP7;
      pmodfor.this.AV20BarNumTon = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15ForCon = (byte)(9) ;
      /* Using cursor P001V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A496ForUltUti = P001V2_A496ForUltUti[0] ;
         n496ForUltUti = P001V2_n496ForUltUti[0] ;
         A484ForCon = P001V2_A484ForCon[0] ;
         A486ForNumCol = P001V2_A486ForNumCol[0] ;
         A995ForTonal = P001V2_A995ForTonal[0] ;
         n995ForTonal = P001V2_n995ForTonal[0] ;
         if ( (0==AV21FlagHss) )
         {
            A496ForUltUti = GXutil.today( ) ;
            n496ForUltUti = false ;
         }
         AV15ForCon = A484ForCon ;
         AV16NumColFor = A486ForNumCol ;
         AV20BarNumTon = GXutil.substring( A995ForTonal, 1, 10) ;
         /* Using cursor P001V3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n496ForUltUti), A496ForUltUti, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodfor.this.A396EmprCod;
      this.aP1[0] = pmodfor.this.A252CliCod;
      this.aP2[0] = pmodfor.this.A494ForSer;
      this.aP3[0] = pmodfor.this.A482ForColNom;
      this.aP4[0] = pmodfor.this.A483ForColNum;
      this.aP5[0] = pmodfor.this.A831TipColCod;
      this.aP6[0] = pmodfor.this.AV15ForCon;
      this.aP7[0] = pmodfor.this.AV16NumColFor;
      this.aP8[0] = pmodfor.this.AV20BarNumTon;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodfor");
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
      P001V2_A396EmprCod = new String[] {""} ;
      P001V2_A252CliCod = new int[1] ;
      P001V2_A494ForSer = new String[] {""} ;
      P001V2_A482ForColNom = new String[] {""} ;
      P001V2_A483ForColNum = new int[1] ;
      P001V2_A831TipColCod = new byte[1] ;
      P001V2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P001V2_n496ForUltUti = new boolean[] {false} ;
      P001V2_A484ForCon = new byte[1] ;
      P001V2_A486ForNumCol = new int[1] ;
      P001V2_A995ForTonal = new String[] {""} ;
      P001V2_n995ForTonal = new boolean[] {false} ;
      A496ForUltUti = GXutil.nullDate() ;
      A995ForTonal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodfor__default(),
         new Object[] {
             new Object[] {
            P001V2_A396EmprCod, P001V2_A252CliCod, P001V2_A494ForSer, P001V2_A482ForColNom, P001V2_A483ForColNum, P001V2_A831TipColCod, P001V2_A496ForUltUti, P001V2_n496ForUltUti, P001V2_A484ForCon, P001V2_A486ForNumCol,
            P001V2_A995ForTonal, P001V2_n995ForTonal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV15ForCon ;
   private byte A484ForCon ;
   private byte AV21FlagHss ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV16NumColFor ;
   private int A486ForNumCol ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV20BarNumTon ;
   private String scmdbuf ;
   private String A995ForTonal ;
   private java.util.Date A496ForUltUti ;
   private boolean n496ForUltUti ;
   private boolean n995ForTonal ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P001V2_A396EmprCod ;
   private int[] P001V2_A252CliCod ;
   private String[] P001V2_A494ForSer ;
   private String[] P001V2_A482ForColNom ;
   private int[] P001V2_A483ForColNum ;
   private byte[] P001V2_A831TipColCod ;
   private java.util.Date[] P001V2_A496ForUltUti ;
   private boolean[] P001V2_n496ForUltUti ;
   private byte[] P001V2_A484ForCon ;
   private int[] P001V2_A486ForNumCol ;
   private String[] P001V2_A995ForTonal ;
   private boolean[] P001V2_n995ForTonal ;
}

final  class pmodfor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001V2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForUltUti, ForCon, ForNumCol, ForTonal FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001V3", "UPDATE TXPCFORMU SET ForUltUti=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

