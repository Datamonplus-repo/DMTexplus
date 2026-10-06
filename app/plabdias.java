package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plabdias extends GXProcedure
{
   public plabdias( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plabdias.class ), "" );
   }

   public plabdias( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      plabdias.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      plabdias.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plabdias.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      plabdias.this.AV8Desvio = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P021K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5541Lb_FechaE = P021K2_A5541Lb_FechaE[0] ;
         AV9Fechaen1 = GXutil.nullDate() ;
         /* Using cursor P021K3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5567Lb_FechaEn = P021K3_A5567Lb_FechaEn[0] ;
            A5555Lb_opcion = P021K3_A5555Lb_opcion[0] ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9Fechaen1)) )
            {
               AV9Fechaen1 = A5567Lb_FechaEn ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV8Desvio = (short)(0) ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9Fechaen1)) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_date2[0] = A5541Lb_FechaE ;
            GXv_date3[0] = AV9Fechaen1 ;
            GXv_int4[0] = AV8Desvio ;
            new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date2, GXv_date3, GXv_int4) ;
            plabdias.this.A396EmprCod = GXv_char1[0] ;
            plabdias.this.A5541Lb_FechaE = GXv_date2[0] ;
            plabdias.this.AV9Fechaen1 = GXv_date3[0] ;
            plabdias.this.AV8Desvio = GXv_int4[0] ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plabdias.this.A396EmprCod;
      this.aP1[0] = plabdias.this.A5532Lb_numero;
      this.aP2[0] = plabdias.this.AV8Desvio;
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
      P021K2_A396EmprCod = new String[] {""} ;
      P021K2_A5532Lb_numero = new int[1] ;
      P021K2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      AV9Fechaen1 = GXutil.nullDate() ;
      P021K3_A396EmprCod = new String[] {""} ;
      P021K3_A5532Lb_numero = new int[1] ;
      P021K3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P021K3_A5555Lb_opcion = new String[] {""} ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      GXv_char1 = new String[1] ;
      GXv_date2 = new java.util.Date[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_int4 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plabdias__default(),
         new Object[] {
             new Object[] {
            P021K2_A396EmprCod, P021K2_A5532Lb_numero, P021K2_A5541Lb_FechaE
            }
            , new Object[] {
            P021K3_A396EmprCod, P021K3_A5532Lb_numero, P021K3_A5567Lb_FechaEn, P021K3_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Desvio ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String GXv_char1[] ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV9Fechaen1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date GXv_date2[] ;
   private java.util.Date GXv_date3[] ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P021K2_A396EmprCod ;
   private int[] P021K2_A5532Lb_numero ;
   private java.util.Date[] P021K2_A5541Lb_FechaE ;
   private String[] P021K3_A396EmprCod ;
   private int[] P021K3_A5532Lb_numero ;
   private java.util.Date[] P021K3_A5567Lb_FechaEn ;
   private String[] P021K3_A5555Lb_opcion ;
}

final  class plabdias__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021K2", "SELECT EmprCod, Lb_numero, Lb_FechaE FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021K3", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Not (Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) ORDER BY EmprCod, Lb_numero, Lb_FechaEn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

