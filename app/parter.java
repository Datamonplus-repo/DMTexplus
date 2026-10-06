package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class parter extends GXProcedure
{
   public parter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parter.class ), "" );
   }

   public parter( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      parter.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      parter.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      parter.this.AV15Disartcod = aP1[0];
      this.aP1 = aP1;
      parter.this.AV16vN1 = aP2[0];
      this.aP2 = aP2;
      parter.this.AV17vN2 = aP3[0];
      this.aP3 = aP3;
      parter.this.AV18vN3 = aP4[0];
      this.aP4 = aP4;
      parter.this.AV19vN4 = aP5[0];
      this.aP5 = aP5;
      parter.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Er_art = AV16vN1 + AV17vN2 + AV18vN3 + AV19vN4 + GXutil.substring( AV15Disartcod, 1, 4) ;
      Gx_msg = httpContext.getMessage( "ERROR.Articulo ", "") + AV20Er_art + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "sin PRECIO en el sistema COMERCIAL", "") + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "pedir el ALTA", "") + GXutil.chr( (short)(13)) ;
      /* Using cursor P04442 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV20Er_art});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10812ER_Art = P04442_A10812ER_Art[0] ;
         Gx_msg = " " ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = parter.this.A396EmprCod;
      this.aP1[0] = parter.this.AV15Disartcod;
      this.aP2[0] = parter.this.AV16vN1;
      this.aP3[0] = parter.this.AV17vN2;
      this.aP4[0] = parter.this.AV18vN3;
      this.aP5[0] = parter.this.AV19vN4;
      this.aP6[0] = parter.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Er_art = "" ;
      scmdbuf = "" ;
      P04442_A396EmprCod = new String[] {""} ;
      P04442_A10812ER_Art = new String[] {""} ;
      A10812ER_Art = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.parter__default(),
         new Object[] {
             new Object[] {
            P04442_A396EmprCod, P04442_A10812ER_Art
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15Disartcod ;
   private String AV16vN1 ;
   private String AV17vN2 ;
   private String AV18vN3 ;
   private String AV19vN4 ;
   private String Gx_msg ;
   private String AV20Er_art ;
   private String scmdbuf ;
   private String A10812ER_Art ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04442_A396EmprCod ;
   private String[] P04442_A10812ER_Art ;
}

final  class parter__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04442", "SELECT EmprCod, ER_Art FROM TXPARTER WHERE EmprCod = ? and ER_Art = ? ORDER BY EmprCod, ER_Art ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
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
               stmt.setString(2, (String)parms[1], 12);
               return;
      }
   }

}

