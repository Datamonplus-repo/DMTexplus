package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayoenviado extends GXProcedure
{
   public ensayoenviado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayoenviado.class ), "" );
   }

   public ensayoenviado( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      ensayoenviado.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      ensayoenviado.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ensayoenviado.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      ensayoenviado.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Enviado = (byte)(0) ;
      /* Using cursor P09PK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6461Lb_FecNoa1 = P09PK2_A6461Lb_FecNoa1[0] ;
         A5567Lb_FechaEn = P09PK2_A5567Lb_FechaEn[0] ;
         A5555Lb_opcion = P09PK2_A5555Lb_opcion[0] ;
         AV8Enviado = (byte)((!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) ? 1 : 0)) ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ensayoenviado.this.A396EmprCod;
      this.aP1[0] = ensayoenviado.this.A5532Lb_numero;
      this.aP2[0] = ensayoenviado.this.AV8Enviado;
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
      P09PK2_A396EmprCod = new String[] {""} ;
      P09PK2_A5532Lb_numero = new int[1] ;
      P09PK2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09PK2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09PK2_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayoenviado__default(),
         new Object[] {
             new Object[] {
            P09PK2_A396EmprCod, P09PK2_A5532Lb_numero, P09PK2_A6461Lb_FecNoa1, P09PK2_A5567Lb_FechaEn, P09PK2_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Enviado ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PK2_A396EmprCod ;
   private int[] P09PK2_A5532Lb_numero ;
   private java.util.Date[] P09PK2_A6461Lb_FecNoa1 ;
   private java.util.Date[] P09PK2_A5567Lb_FechaEn ;
   private String[] P09PK2_A5555Lb_opcion ;
}

final  class ensayoenviado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PK2", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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

