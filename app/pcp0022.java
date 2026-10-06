package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcp0022 extends GXProcedure
{
   public pcp0022( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcp0022.class ), "" );
   }

   public pcp0022( int remoteHandle ,
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
      pcp0022.this.aP6 = new String[] {""};
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
      pcp0022.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcp0022.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcp0022.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pcp0022.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pcp0022.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pcp0022.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pcp0022.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P02QR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2749ForPro = P02QR2_A2749ForPro[0] ;
         n2749ForPro = P02QR2_n2749ForPro[0] ;
         if ( GXutil.strcmp(A2749ForPro, httpContext.getMessage( "S", "")) == 0 )
         {
            Gx_msg = httpContext.getMessage( "Esta cor esta suspendido", "") + GXutil.newLine( ) + httpContext.getMessage( "Faz favor contactar com o departamento de Tinte.", "") + GXutil.newLine( ) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcp0022.this.A396EmprCod;
      this.aP1[0] = pcp0022.this.A252CliCod;
      this.aP2[0] = pcp0022.this.A494ForSer;
      this.aP3[0] = pcp0022.this.A482ForColNom;
      this.aP4[0] = pcp0022.this.A483ForColNum;
      this.aP5[0] = pcp0022.this.A831TipColCod;
      this.aP6[0] = pcp0022.this.Gx_msg;
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
      P02QR2_A396EmprCod = new String[] {""} ;
      P02QR2_A252CliCod = new int[1] ;
      P02QR2_A494ForSer = new String[] {""} ;
      P02QR2_A482ForColNom = new String[] {""} ;
      P02QR2_A483ForColNum = new int[1] ;
      P02QR2_A831TipColCod = new byte[1] ;
      P02QR2_A2749ForPro = new String[] {""} ;
      P02QR2_n2749ForPro = new boolean[] {false} ;
      A2749ForPro = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcp0022__default(),
         new Object[] {
             new Object[] {
            P02QR2_A396EmprCod, P02QR2_A252CliCod, P02QR2_A494ForSer, P02QR2_A482ForColNom, P02QR2_A483ForColNum, P02QR2_A831TipColCod, P02QR2_A2749ForPro, P02QR2_n2749ForPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2749ForPro ;
   private boolean n2749ForPro ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02QR2_A396EmprCod ;
   private int[] P02QR2_A252CliCod ;
   private String[] P02QR2_A494ForSer ;
   private String[] P02QR2_A482ForColNom ;
   private int[] P02QR2_A483ForColNum ;
   private byte[] P02QR2_A831TipColCod ;
   private String[] P02QR2_A2749ForPro ;
   private boolean[] P02QR2_n2749ForPro ;
}

final  class pcp0022__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02QR2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForPro FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

