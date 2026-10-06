package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmtc extends GXProcedure
{
   public pbusmtc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmtc.class ), "" );
   }

   public pbusmtc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 )
   {
      pbusmtc.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pbusmtc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusmtc.this.A996TipCon = aP1[0];
      this.aP1 = aP1;
      pbusmtc.this.AV12MaqConCon = aP2[0];
      this.aP2 = aP2;
      pbusmtc.this.AV8GrupMaq = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8GrupMaq = "" ;
      /* Using cursor P00C72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n996TipCon), Short.valueOf(A996TipCon), Short.valueOf(AV12MaqConCon)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2016MaqConCon = P00C72_A2016MaqConCon[0] ;
         n2016MaqConCon = P00C72_n2016MaqConCon[0] ;
         A602MaqCod = P00C72_A602MaqCod[0] ;
         A2014MaqConLin = P00C72_A2014MaqConLin[0] ;
         AV8GrupMaq = A602MaqCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusmtc.this.A396EmprCod;
      this.aP1[0] = pbusmtc.this.A996TipCon;
      this.aP2[0] = pbusmtc.this.AV12MaqConCon;
      this.aP3[0] = pbusmtc.this.AV8GrupMaq;
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
      P00C72_A396EmprCod = new String[] {""} ;
      P00C72_A996TipCon = new short[1] ;
      P00C72_n996TipCon = new boolean[] {false} ;
      P00C72_A2016MaqConCon = new short[1] ;
      P00C72_n2016MaqConCon = new boolean[] {false} ;
      P00C72_A602MaqCod = new String[] {""} ;
      P00C72_A2014MaqConLin = new short[1] ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmtc__default(),
         new Object[] {
             new Object[] {
            P00C72_A396EmprCod, P00C72_A996TipCon, P00C72_n996TipCon, P00C72_A2016MaqConCon, P00C72_n2016MaqConCon, P00C72_A602MaqCod, P00C72_A2014MaqConLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A996TipCon ;
   private short AV12MaqConCon ;
   private short A2016MaqConCon ;
   private short A2014MaqConLin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8GrupMaq ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private boolean n996TipCon ;
   private boolean n2016MaqConCon ;
   private String[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00C72_A396EmprCod ;
   private short[] P00C72_A996TipCon ;
   private boolean[] P00C72_n996TipCon ;
   private short[] P00C72_A2016MaqConCon ;
   private boolean[] P00C72_n2016MaqConCon ;
   private String[] P00C72_A602MaqCod ;
   private short[] P00C72_A2014MaqConLin ;
}

final  class pbusmtc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00C72", "SELECT * FROM (SELECT EmprCod, TipCon, MaqConCon, MaqCod, MaqConLin FROM TXPLMAQCO WHERE EmprCod = ? and TipCon = ? and MaqConCon >= ? ORDER BY EmprCod, TipCon, MaqConCon) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((short[]) buf[6])[0] = rslt.getShort(5);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

