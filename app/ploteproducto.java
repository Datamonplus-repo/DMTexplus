package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ploteproducto extends GXProcedure
{
   public ploteproducto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ploteproducto.class ), "" );
   }

   public ploteproducto( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      ploteproducto.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      ploteproducto.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ploteproducto.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ploteproducto.this.AV8PrdLote = aP2[0];
      this.aP2 = aP2;
      ploteproducto.this.AV9PrvNum = aP3[0];
      this.aP3 = aP3;
      ploteproducto.this.AV10Prdnom2 = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PrdLote = " " ;
      AV10Prdnom2 = " " ;
      AV9PrvNum = 0 ;
      /* Using cursor P04NI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10881PrdLote = P04NI2_A10881PrdLote[0] ;
         A795PrvNum = P04NI2_A795PrvNum[0] ;
         A4692PrdNom2 = P04NI2_A4692PrdNom2[0] ;
         AV8PrdLote = A10881PrdLote ;
         AV9PrvNum = A795PrvNum ;
         AV10Prdnom2 = A4692PrdNom2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ploteproducto.this.A396EmprCod;
      this.aP1[0] = ploteproducto.this.A719PrdNum;
      this.aP2[0] = ploteproducto.this.AV8PrdLote;
      this.aP3[0] = ploteproducto.this.AV9PrvNum;
      this.aP4[0] = ploteproducto.this.AV10Prdnom2;
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
      P04NI2_A396EmprCod = new String[] {""} ;
      P04NI2_A719PrdNum = new String[] {""} ;
      P04NI2_A10881PrdLote = new String[] {""} ;
      P04NI2_A795PrvNum = new int[1] ;
      P04NI2_A4692PrdNom2 = new String[] {""} ;
      A10881PrdLote = "" ;
      A4692PrdNom2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ploteproducto__default(),
         new Object[] {
             new Object[] {
            P04NI2_A396EmprCod, P04NI2_A719PrdNum, P04NI2_A10881PrdLote, P04NI2_A795PrvNum, P04NI2_A4692PrdNom2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9PrvNum ;
   private int A795PrvNum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8PrdLote ;
   private String AV10Prdnom2 ;
   private String scmdbuf ;
   private String A10881PrdLote ;
   private String A4692PrdNom2 ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NI2_A396EmprCod ;
   private String[] P04NI2_A719PrdNum ;
   private String[] P04NI2_A10881PrdLote ;
   private int[] P04NI2_A795PrvNum ;
   private String[] P04NI2_A4692PrdNom2 ;
}

final  class ploteproducto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NI2", "SELECT EmprCod, PrdNum, PrdLote, PrvNum, PrdNom2 FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
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
               return;
      }
   }

}

