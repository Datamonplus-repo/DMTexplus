package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetpie extends GXProcedure
{
   public pmetpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetpie.class ), "" );
   }

   public pmetpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pmetpie.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pmetpie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmetpie.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmetpie.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmetpie.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmetpie.this.AV10BarCal = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10BarCal = " " ;
      /* Using cursor P00H62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2452BarCal = P00H62_A2452BarCal[0] ;
         n2452BarCal = P00H62_n2452BarCal[0] ;
         if ( GXutil.strcmp(A2452BarCal, " ") != 0 )
         {
            AV10BarCal = A2452BarCal ;
         }
         else
         {
            /* Using cursor P00H63 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A187BarNotDsc = P00H63_A187BarNotDsc[0] ;
               A188BarNotLin = P00H63_A188BarNotLin[0] ;
               AV10BarCal = GXutil.trim( GXutil.substring( A187BarNotDsc, 1, 20)) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmetpie.this.A396EmprCod;
      this.aP1[0] = pmetpie.this.A129BarCod;
      this.aP2[0] = pmetpie.this.A132BarCodReo;
      this.aP3[0] = pmetpie.this.A130BarCodPar;
      this.aP4[0] = pmetpie.this.AV10BarCal;
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
      P00H62_A396EmprCod = new String[] {""} ;
      P00H62_A129BarCod = new int[1] ;
      P00H62_A132BarCodReo = new byte[1] ;
      P00H62_A130BarCodPar = new String[] {""} ;
      P00H62_A2452BarCal = new String[] {""} ;
      P00H62_n2452BarCal = new boolean[] {false} ;
      A2452BarCal = "" ;
      P00H63_A396EmprCod = new String[] {""} ;
      P00H63_A129BarCod = new int[1] ;
      P00H63_A132BarCodReo = new byte[1] ;
      P00H63_A130BarCodPar = new String[] {""} ;
      P00H63_A187BarNotDsc = new String[] {""} ;
      P00H63_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmetpie__default(),
         new Object[] {
             new Object[] {
            P00H62_A396EmprCod, P00H62_A129BarCod, P00H62_A132BarCodReo, P00H62_A130BarCodPar, P00H62_A2452BarCal, P00H62_n2452BarCal
            }
            , new Object[] {
            P00H63_A396EmprCod, P00H63_A129BarCod, P00H63_A132BarCodReo, P00H63_A130BarCodPar, P00H63_A187BarNotDsc, P00H63_A188BarNotLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A188BarNotLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10BarCal ;
   private String scmdbuf ;
   private String A2452BarCal ;
   private String A187BarNotDsc ;
   private boolean n2452BarCal ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00H62_A396EmprCod ;
   private int[] P00H62_A129BarCod ;
   private byte[] P00H62_A132BarCodReo ;
   private String[] P00H62_A130BarCodPar ;
   private String[] P00H62_A2452BarCal ;
   private boolean[] P00H62_n2452BarCal ;
   private String[] P00H63_A396EmprCod ;
   private int[] P00H63_A129BarCod ;
   private byte[] P00H63_A132BarCodReo ;
   private String[] P00H63_A130BarCodPar ;
   private String[] P00H63_A187BarNotDsc ;
   private byte[] P00H63_A188BarNotLin ;
}

final  class pmetpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00H62", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarCal FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00H63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

