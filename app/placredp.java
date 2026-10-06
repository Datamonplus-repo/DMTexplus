package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class placredp extends GXProcedure
{
   public placredp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( placredp.class ), "" );
   }

   public placredp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 )
   {
      placredp.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      placredp.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      placredp.this.AV11Lacre = aP1[0];
      this.aP1 = aP1;
      placredp.this.AV9DisCod = aP2[0];
      this.aP2 = aP2;
      placredp.this.AV10ProCod = aP3[0];
      this.aP3 = aP3;
      placredp.this.AV12existe = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9DisCod = 0 ;
      AV10ProCod = "" ;
      AV12existe = (byte)(0) ;
      /* Using cursor P02M52 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV11Lacre});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6650Lacre = P02M52_A6650Lacre[0] ;
         A396EmprCod = P02M52_A396EmprCod[0] ;
         A6651LcrDisCod = P02M52_A6651LcrDisCod[0] ;
         n6651LcrDisCod = P02M52_n6651LcrDisCod[0] ;
         A6652LcrProCod = P02M52_A6652LcrProCod[0] ;
         n6652LcrProCod = P02M52_n6652LcrProCod[0] ;
         AV9DisCod = A6651LcrDisCod ;
         AV10ProCod = A6652LcrProCod ;
         AV12existe = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = placredp.this.AV8EmprCod;
      this.aP1[0] = placredp.this.AV11Lacre;
      this.aP2[0] = placredp.this.AV9DisCod;
      this.aP3[0] = placredp.this.AV10ProCod;
      this.aP4[0] = placredp.this.AV12existe;
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
      P02M52_A6650Lacre = new String[] {""} ;
      P02M52_A396EmprCod = new String[] {""} ;
      P02M52_A6651LcrDisCod = new int[1] ;
      P02M52_n6651LcrDisCod = new boolean[] {false} ;
      P02M52_A6652LcrProCod = new String[] {""} ;
      P02M52_n6652LcrProCod = new boolean[] {false} ;
      A6650Lacre = "" ;
      A396EmprCod = "" ;
      A6652LcrProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.placredp__default(),
         new Object[] {
             new Object[] {
            P02M52_A6650Lacre, P02M52_A396EmprCod, P02M52_A6651LcrDisCod, P02M52_n6651LcrDisCod, P02M52_A6652LcrProCod, P02M52_n6652LcrProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12existe ;
   private short Gx_err ;
   private int AV9DisCod ;
   private int A6651LcrDisCod ;
   private String AV8EmprCod ;
   private String AV11Lacre ;
   private String AV10ProCod ;
   private String scmdbuf ;
   private String A6650Lacre ;
   private String A396EmprCod ;
   private String A6652LcrProCod ;
   private boolean n6651LcrDisCod ;
   private boolean n6652LcrProCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02M52_A6650Lacre ;
   private String[] P02M52_A396EmprCod ;
   private int[] P02M52_A6651LcrDisCod ;
   private boolean[] P02M52_n6651LcrDisCod ;
   private String[] P02M52_A6652LcrProCod ;
   private boolean[] P02M52_n6652LcrProCod ;
}

final  class placredp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02M52", "SELECT Lacre, EmprCod, LcrDisCod, LcrProCod FROM TXPLacre WHERE EmprCod = ? and Lacre = ? ORDER BY EmprCod, Lacre ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

