package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqfase extends GXProcedure
{
   public pmaqfase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqfase.class ), "" );
   }

   public pmaqfase( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pmaqfase.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pmaqfase.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmaqfase.this.AV8Maqcod = aP1[0];
      this.aP1 = aP1;
      pmaqfase.this.AV10FasCod = aP2[0];
      this.aP2 = aP2;
      pmaqfase.this.AV9MaqFas = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9MaqFas = (byte)(0) ;
      /* Using cursor P043A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Maqcod, AV10FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1142MaqFCod = P043A2_A1142MaqFCod[0] ;
         A602MaqCod = P043A2_A602MaqCod[0] ;
         AV9MaqFas = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmaqfase.this.A396EmprCod;
      this.aP1[0] = pmaqfase.this.AV8Maqcod;
      this.aP2[0] = pmaqfase.this.AV10FasCod;
      this.aP3[0] = pmaqfase.this.AV9MaqFas;
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
      P043A2_A396EmprCod = new String[] {""} ;
      P043A2_A1142MaqFCod = new String[] {""} ;
      P043A2_A602MaqCod = new String[] {""} ;
      A1142MaqFCod = "" ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqfase__default(),
         new Object[] {
             new Object[] {
            P043A2_A396EmprCod, P043A2_A1142MaqFCod, P043A2_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9MaqFas ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Maqcod ;
   private String AV10FasCod ;
   private String scmdbuf ;
   private String A1142MaqFCod ;
   private String A602MaqCod ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P043A2_A396EmprCod ;
   private String[] P043A2_A1142MaqFCod ;
   private String[] P043A2_A602MaqCod ;
}

final  class pmaqfase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P043A2", "SELECT EmprCod, MaqFCod, MaqCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

