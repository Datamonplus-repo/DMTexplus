package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existemaquinamaquin extends GXProcedure
{
   public existemaquinamaquin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existemaquinamaquin.class ), "" );
   }

   public existemaquinamaquin( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      existemaquinamaquin.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      existemaquinamaquin.this.A396EmprCod = aP0;
      existemaquinamaquin.this.A602MaqCod = aP1;
      existemaquinamaquin.this.aP2 = aP2;
      existemaquinamaquin.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = httpContext.getMessage( "N", "") ;
      AV10MaqDsc = " " ;
      /* Using cursor P087R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A606MaqDsc = P087R2_A606MaqDsc[0] ;
         n606MaqDsc = P087R2_n606MaqDsc[0] ;
         AV8Ok = httpContext.getMessage( "S", "") ;
         AV10MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = existemaquinamaquin.this.AV10MaqDsc;
      this.aP3[0] = existemaquinamaquin.this.AV8Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10MaqDsc = "" ;
      AV8Ok = "" ;
      scmdbuf = "" ;
      P087R2_A396EmprCod = new String[] {""} ;
      P087R2_A602MaqCod = new String[] {""} ;
      P087R2_A606MaqDsc = new String[] {""} ;
      P087R2_n606MaqDsc = new boolean[] {false} ;
      A606MaqDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existemaquinamaquin__default(),
         new Object[] {
             new Object[] {
            P087R2_A396EmprCod, P087R2_A602MaqCod, P087R2_A606MaqDsc, P087R2_n606MaqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV10MaqDsc ;
   private String AV8Ok ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private boolean n606MaqDsc ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P087R2_A396EmprCod ;
   private String[] P087R2_A602MaqCod ;
   private String[] P087R2_A606MaqDsc ;
   private boolean[] P087R2_n606MaqDsc ;
}

final  class existemaquinamaquin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087R2", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

