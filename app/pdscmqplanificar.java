package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdscmqplanificar extends GXProcedure
{
   public pdscmqplanificar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdscmqplanificar.class ), "" );
   }

   public pdscmqplanificar( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pdscmqplanificar.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pdscmqplanificar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdscmqplanificar.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pdscmqplanificar.this.AV15maqdsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15maqdsc = " " ;
      AV18GXLvl3 = (byte)(0) ;
      /* Using cursor P05V42 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A606MaqDsc = P05V42_A606MaqDsc[0] ;
         n606MaqDsc = P05V42_n606MaqDsc[0] ;
         A604MaqCodFor = P05V42_A604MaqCodFor[0] ;
         n604MaqCodFor = P05V42_n604MaqCodFor[0] ;
         AV18GXLvl3 = (byte)(1) ;
         AV15maqdsc = ((GXutil.strcmp("", A604MaqCodFor)==0) ? A606MaqDsc : A604MaqCodFor) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl3 == 0 )
      {
         if ( GXutil.strcmp(A602MaqCod, " ") != 0 )
         {
            AV15maqdsc = httpContext.getMessage( "Error", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdscmqplanificar.this.A396EmprCod;
      this.aP1[0] = pdscmqplanificar.this.A602MaqCod;
      this.aP2[0] = pdscmqplanificar.this.AV15maqdsc;
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
      P05V42_A396EmprCod = new String[] {""} ;
      P05V42_A602MaqCod = new String[] {""} ;
      P05V42_A606MaqDsc = new String[] {""} ;
      P05V42_n606MaqDsc = new boolean[] {false} ;
      P05V42_A604MaqCodFor = new String[] {""} ;
      P05V42_n604MaqCodFor = new boolean[] {false} ;
      A606MaqDsc = "" ;
      A604MaqCodFor = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdscmqplanificar__default(),
         new Object[] {
             new Object[] {
            P05V42_A396EmprCod, P05V42_A602MaqCod, P05V42_A606MaqDsc, P05V42_n606MaqDsc, P05V42_A604MaqCodFor, P05V42_n604MaqCodFor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV15maqdsc ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String A604MaqCodFor ;
   private boolean n606MaqDsc ;
   private boolean n604MaqCodFor ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05V42_A396EmprCod ;
   private String[] P05V42_A602MaqCod ;
   private String[] P05V42_A606MaqDsc ;
   private boolean[] P05V42_n606MaqDsc ;
   private String[] P05V42_A604MaqCodFor ;
   private boolean[] P05V42_n604MaqCodFor ;
}

final  class pdscmqplanificar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05V42", "SELECT EmprCod, MaqCod, MaqDsc, MaqCodFor FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

