package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpzsa extends GXProcedure
{
   public pnumpzsa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpzsa.class ), "" );
   }

   public pnumpzsa( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      pnumpzsa.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pnumpzsa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpzsa.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      pnumpzsa.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pnumpzsa.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnumpzsa.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pnumpzsa.this.AV28MetPieObs = aP5[0];
      this.aP5 = aP5;
      pnumpzsa.this.AV23Piezactrl = aP6[0];
      this.aP6 = aP6;
      pnumpzsa.this.AV24UltimaPieza = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV26NumPzsFs ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF", ""), GXv_int2) ;
      pnumpzsa.this.GXt_int1 = GXv_int2[0] ;
      AV26NumPzsFs = GXt_int1 ;
      GXt_int1 = AV27NumPzsFs2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF2", ""), GXv_int2) ;
      pnumpzsa.this.GXt_int1 = GXv_int2[0] ;
      AV27NumPzsFs2 = GXt_int1 ;
      AV25Barordlin = (short)(GXutil.lval( GXutil.substring( AV28MetPieObs, 18, 8))) ;
      if ( ( AV26NumPzsFs == 1 ) || ( AV27NumPzsFs2 == 1 ) )
      {
         AV22LastPieza = 0 ;
         AV24UltimaPieza = (byte)(0) ;
         /* Using cursor P04OL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4917MetPieObs = P04OL2_A4917MetPieObs[0] ;
            A2813MetPieCod = P04OL2_A2813MetPieCod[0] ;
            AV29ValNum = (short)(GXutil.lval( GXutil.trim( GXutil.substring( A4917MetPieObs, 18, 8)))) ;
            if ( AV29ValNum == AV25Barordlin )
            {
               AV22LastPieza = (int)(GXutil.lval( GXutil.substring( A2813MetPieCod, 5, 5))) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         AV22LastPieza = 0 ;
         AV24UltimaPieza = (byte)(0) ;
         /* Using cursor P04OL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2813MetPieCod = P04OL3_A2813MetPieCod[0] ;
            AV22LastPieza = (int)(GXutil.lval( A2813MetPieCod)) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( ( AV26NumPzsFs == 1 ) || ( AV27NumPzsFs2 == 1 ) )
      {
         if ( CommonUtil.decimalVal( GXutil.substring( AV23Piezactrl, 5, 5), ".").doubleValue() > AV22LastPieza )
         {
            AV24UltimaPieza = (byte)(1) ;
         }
         if ( CommonUtil.decimalVal( GXutil.substring( AV23Piezactrl, 5, 5), ".").doubleValue() < AV22LastPieza )
         {
            AV24UltimaPieza = (byte)(2) ;
         }
      }
      else
      {
         if ( CommonUtil.decimalVal( AV23Piezactrl, ".").doubleValue() > AV22LastPieza )
         {
            AV24UltimaPieza = (byte)(1) ;
         }
         if ( CommonUtil.decimalVal( AV23Piezactrl, ".").doubleValue() < AV22LastPieza )
         {
            AV24UltimaPieza = (byte)(2) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpzsa.this.A396EmprCod;
      this.aP1[0] = pnumpzsa.this.A2809MetTerCod;
      this.aP2[0] = pnumpzsa.this.A129BarCod;
      this.aP3[0] = pnumpzsa.this.A132BarCodReo;
      this.aP4[0] = pnumpzsa.this.A130BarCodPar;
      this.aP5[0] = pnumpzsa.this.AV28MetPieObs;
      this.aP6[0] = pnumpzsa.this.AV23Piezactrl;
      this.aP7[0] = pnumpzsa.this.AV24UltimaPieza;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P04OL2_A396EmprCod = new String[] {""} ;
      P04OL2_A2809MetTerCod = new String[] {""} ;
      P04OL2_A129BarCod = new int[1] ;
      P04OL2_A132BarCodReo = new byte[1] ;
      P04OL2_A130BarCodPar = new String[] {""} ;
      P04OL2_A4917MetPieObs = new String[] {""} ;
      P04OL2_A2813MetPieCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2813MetPieCod = "" ;
      P04OL3_A396EmprCod = new String[] {""} ;
      P04OL3_A2809MetTerCod = new String[] {""} ;
      P04OL3_A129BarCod = new int[1] ;
      P04OL3_A132BarCodReo = new byte[1] ;
      P04OL3_A130BarCodPar = new String[] {""} ;
      P04OL3_A2813MetPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpzsa__default(),
         new Object[] {
             new Object[] {
            P04OL2_A396EmprCod, P04OL2_A2809MetTerCod, P04OL2_A129BarCod, P04OL2_A132BarCodReo, P04OL2_A130BarCodPar, P04OL2_A4917MetPieObs, P04OL2_A2813MetPieCod
            }
            , new Object[] {
            P04OL3_A396EmprCod, P04OL3_A2809MetTerCod, P04OL3_A129BarCod, P04OL3_A132BarCodReo, P04OL3_A130BarCodPar, P04OL3_A2813MetPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV24UltimaPieza ;
   private byte AV26NumPzsFs ;
   private byte AV27NumPzsFs2 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV25Barordlin ;
   private short AV29ValNum ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV22LastPieza ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String AV23Piezactrl ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String AV28MetPieObs ;
   private String A4917MetPieObs ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04OL2_A396EmprCod ;
   private String[] P04OL2_A2809MetTerCod ;
   private int[] P04OL2_A129BarCod ;
   private byte[] P04OL2_A132BarCodReo ;
   private String[] P04OL2_A130BarCodPar ;
   private String[] P04OL2_A4917MetPieObs ;
   private String[] P04OL2_A2813MetPieCod ;
   private String[] P04OL3_A396EmprCod ;
   private String[] P04OL3_A2809MetTerCod ;
   private int[] P04OL3_A129BarCod ;
   private byte[] P04OL3_A132BarCodReo ;
   private String[] P04OL3_A130BarCodPar ;
   private String[] P04OL3_A2813MetPieCod ;
}

final  class pnumpzsa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04OL2", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OL3", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

