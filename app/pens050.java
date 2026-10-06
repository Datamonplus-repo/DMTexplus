package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens050 extends GXProcedure
{
   public pens050( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens050.class ), "" );
   }

   public pens050( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pens050.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pens050.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens050.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens050.this.AV8Procesos = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Procesos = httpContext.getMessage( "N", "") ;
      /* Using cursor P02E22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5551Lb_lineaPq = P02E22_A5551Lb_lineaPq[0] ;
         AV8Procesos = httpContext.getMessage( "S", "") ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens050.this.A396EmprCod;
      this.aP1[0] = pens050.this.A5532Lb_numero;
      this.aP2[0] = pens050.this.AV8Procesos;
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
      P02E22_A396EmprCod = new String[] {""} ;
      P02E22_A5532Lb_numero = new int[1] ;
      P02E22_A5551Lb_lineaPq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens050__default(),
         new Object[] {
             new Object[] {
            P02E22_A396EmprCod, P02E22_A5532Lb_numero, P02E22_A5551Lb_lineaPq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5551Lb_lineaPq ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV8Procesos ;
   private String scmdbuf ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02E22_A396EmprCod ;
   private int[] P02E22_A5532Lb_numero ;
   private short[] P02E22_A5551Lb_lineaPq ;
}

final  class pens050__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02E22", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               return;
      }
   }

}

