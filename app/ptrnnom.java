package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptrnnom extends GXProcedure
{
   public ptrnnom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptrnnom.class ), "" );
   }

   public ptrnnom( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      ptrnnom.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      ptrnnom.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptrnnom.this.A840TrnCod = aP1[0];
      this.aP1 = aP1;
      ptrnnom.this.AV8TrnNom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TrnNom = " " ;
      AV11GXLvl4 = (byte)(0) ;
      /* Using cursor P03Z02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A841TrnNom = P03Z02_A841TrnNom[0] ;
         n841TrnNom = P03Z02_n841TrnNom[0] ;
         AV11GXLvl4 = (byte)(1) ;
         AV8TrnNom = A841TrnNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl4 == 0 )
      {
         if ( A840TrnCod > 0 )
         {
            AV8TrnNom = httpContext.getMessage( "Error", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptrnnom.this.A396EmprCod;
      this.aP1[0] = ptrnnom.this.A840TrnCod;
      this.aP2[0] = ptrnnom.this.AV8TrnNom;
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
      P03Z02_A396EmprCod = new String[] {""} ;
      P03Z02_A840TrnCod = new short[1] ;
      P03Z02_A841TrnNom = new String[] {""} ;
      P03Z02_n841TrnNom = new boolean[] {false} ;
      A841TrnNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptrnnom__default(),
         new Object[] {
             new Object[] {
            P03Z02_A396EmprCod, P03Z02_A840TrnCod, P03Z02_A841TrnNom, P03Z02_n841TrnNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl4 ;
   private short A840TrnCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8TrnNom ;
   private String scmdbuf ;
   private String A841TrnNom ;
   private boolean n841TrnNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03Z02_A396EmprCod ;
   private short[] P03Z02_A840TrnCod ;
   private String[] P03Z02_A841TrnNom ;
   private boolean[] P03Z02_n841TrnNom ;
}

final  class ptrnnom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03Z02", "SELECT EmprCod, TrnCod, TrnNom FROM TXPTRANSP WHERE EmprCod = ? and TrnCod = ? ORDER BY EmprCod, TrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

