package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactany extends GXProcedure
{
   public pactany( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactany.class ), "" );
   }

   public pactany( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      pactany.this.A396EmprCod = aP0;
      pactany.this.A129BarCod = aP1;
      pactany.this.A132BarCodReo = aP2;
      pactany.this.A130BarCodPar = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pactany.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      pactany.this.A396EmprCod = GXv_char2[0] ;
      pactany.this.AV16EmprNom = GXv_char3[0] ;
      pactany.this.AV17UsurCod = GXv_char4[0] ;
      AV18inc_obs = " " ;
      /* Using cursor P002G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A189BarNumAny = P002G2_A189BarNumAny[0] ;
         AV18inc_obs = httpContext.getMessage( "Actualizo Nº añadidas ", "") + GXutil.trim( GXutil.str( A189BarNumAny, 3, 0)) + httpContext.getMessage( " sumando +1", "") ;
         A189BarNumAny = (short)(A189BarNumAny+1) ;
         /* Using cursor P002G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A119BarAgrCod = P002G3_A119BarAgrCod[0] ;
            A124BarAgrReo = P002G3_A124BarAgrReo[0] ;
            A122BarAgrPar = P002G3_A122BarAgrPar[0] ;
            new app.pactany2(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P002G4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A189BarNumAny), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV18inc_obs, "") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV17UsurCod, AV15Station, AV18inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pactany");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV18inc_obs = "" ;
      scmdbuf = "" ;
      P002G2_A396EmprCod = new String[] {""} ;
      P002G2_A129BarCod = new int[1] ;
      P002G2_A132BarCodReo = new byte[1] ;
      P002G2_A130BarCodPar = new String[] {""} ;
      P002G2_A189BarNumAny = new short[1] ;
      P002G3_A396EmprCod = new String[] {""} ;
      P002G3_A129BarCod = new int[1] ;
      P002G3_A132BarCodReo = new byte[1] ;
      P002G3_A130BarCodPar = new String[] {""} ;
      P002G3_A119BarAgrCod = new int[1] ;
      P002G3_A124BarAgrReo = new byte[1] ;
      P002G3_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      AV24Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactany__default(),
         new Object[] {
             new Object[] {
            P002G2_A396EmprCod, P002G2_A129BarCod, P002G2_A132BarCodReo, P002G2_A130BarCodPar, P002G2_A189BarNumAny
            }
            , new Object[] {
            P002G3_A396EmprCod, P002G3_A129BarCod, P002G3_A132BarCodReo, P002G3_A130BarCodPar, P002G3_A119BarAgrCod, P002G3_A124BarAgrReo, P002G3_A122BarAgrPar
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "PACTANY" ;
      /* GeneXus formulas. */
      AV24Pgmname = "PACTANY" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short A189BarNumAny ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A122BarAgrPar ;
   private String AV24Pgmname ;
   private String AV18inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P002G2_A396EmprCod ;
   private int[] P002G2_A129BarCod ;
   private byte[] P002G2_A132BarCodReo ;
   private String[] P002G2_A130BarCodPar ;
   private short[] P002G2_A189BarNumAny ;
   private String[] P002G3_A396EmprCod ;
   private int[] P002G3_A129BarCod ;
   private byte[] P002G3_A132BarCodReo ;
   private String[] P002G3_A130BarCodPar ;
   private int[] P002G3_A119BarAgrCod ;
   private byte[] P002G3_A124BarAgrReo ;
   private String[] P002G3_A122BarAgrPar ;
}

final  class pactany__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002G2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNumAny FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002G3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002G4", "UPDATE TXPBARCAD SET BarNumAny=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

