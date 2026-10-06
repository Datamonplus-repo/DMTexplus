package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock34 extends GXProcedure
{
   public plock34( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock34.class ), "" );
   }

   public plock34( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      plock34.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      plock34.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock34.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      plock34.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      plock34.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      plock34.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      plock34.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04FK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2749ForPro = P04FK2_A2749ForPro[0] ;
         n2749ForPro = P04FK2_n2749ForPro[0] ;
         AV31ForPro = A2749ForPro ;
         A2749ForPro = AV31ForPro ;
         n2749ForPro = false ;
         /* Using cursor P04FK3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2749ForPro), A2749ForPro, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock34.this.A396EmprCod;
      this.aP1[0] = plock34.this.A252CliCod;
      this.aP2[0] = plock34.this.A494ForSer;
      this.aP3[0] = plock34.this.A482ForColNom;
      this.aP4[0] = plock34.this.A483ForColNum;
      this.aP5[0] = plock34.this.A831TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock34");
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
      P04FK2_A396EmprCod = new String[] {""} ;
      P04FK2_A252CliCod = new int[1] ;
      P04FK2_A494ForSer = new String[] {""} ;
      P04FK2_A482ForColNom = new String[] {""} ;
      P04FK2_A483ForColNum = new int[1] ;
      P04FK2_A831TipColCod = new byte[1] ;
      P04FK2_A2749ForPro = new String[] {""} ;
      P04FK2_n2749ForPro = new boolean[] {false} ;
      A2749ForPro = "" ;
      AV31ForPro = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock34__default(),
         new Object[] {
             new Object[] {
            P04FK2_A396EmprCod, P04FK2_A252CliCod, P04FK2_A494ForSer, P04FK2_A482ForColNom, P04FK2_A483ForColNum, P04FK2_A831TipColCod, P04FK2_A2749ForPro, P04FK2_n2749ForPro
            }
            , new Object[] {
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
   private String scmdbuf ;
   private String A2749ForPro ;
   private String AV31ForPro ;
   private boolean n2749ForPro ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04FK2_A396EmprCod ;
   private int[] P04FK2_A252CliCod ;
   private String[] P04FK2_A494ForSer ;
   private String[] P04FK2_A482ForColNom ;
   private int[] P04FK2_A483ForColNum ;
   private byte[] P04FK2_A831TipColCod ;
   private String[] P04FK2_A2749ForPro ;
   private boolean[] P04FK2_n2749ForPro ;
}

final  class plock34__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04FK2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForPro FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04FK3", "UPDATE TXPCFORMU SET ForPro=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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

