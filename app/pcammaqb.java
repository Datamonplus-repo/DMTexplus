package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcammaqb extends GXProcedure
{
   public pcammaqb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcammaqb.class ), "" );
   }

   public pcammaqb( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pcammaqb.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pcammaqb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcammaqb.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcammaqb.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcammaqb.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcammaqb.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      pcammaqb.this.A396EmprCod = GXv_char1[0] ;
      pcammaqb.this.AV13EmprNom = GXv_char2[0] ;
      pcammaqb.this.AV11UsurCod = GXv_char3[0] ;
      AV8BarMaqCod = " " ;
      /* Using cursor P02LG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P02LG2_A602MaqCod[0] ;
         AV8BarMaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02LG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A180BarMaqCod = P02LG3_A180BarMaqCod[0] ;
         A120BarAgrEst = P02LG3_A120BarAgrEst[0] ;
         AV14Inc_obs = httpContext.getMessage( "Cambio Maquina en BARCAD", "") + GXutil.newLine( ) ;
         AV14Inc_obs += httpContext.getMessage( "Maquina ", "") + GXutil.trim( A180BarMaqCod) + httpContext.getMessage( " se cambia por ", "") + AV8BarMaqCod ;
         A180BarMaqCod = AV8BarMaqCod ;
         AV10BarAgrEst = A120BarAgrEst ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV19Pgmname, AV11UsurCod, AV12Station, AV14Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char1[0] = AV8BarMaqCod ;
         GXv_char6[0] = AV11UsurCod ;
         GXv_char7[0] = AV12Station ;
         new app.pprc107(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_char1, GXv_char6, GXv_char7) ;
         pcammaqb.this.A396EmprCod = GXv_char3[0] ;
         pcammaqb.this.A129BarCod = GXv_int4[0] ;
         pcammaqb.this.A132BarCodReo = GXv_int5[0] ;
         pcammaqb.this.A130BarCodPar = GXv_char2[0] ;
         pcammaqb.this.AV8BarMaqCod = GXv_char1[0] ;
         pcammaqb.this.AV11UsurCod = GXv_char6[0] ;
         pcammaqb.this.AV12Station = GXv_char7[0] ;
         /* Using cursor P02LG4 */
         pr_default.execute(2, new Object[] {A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV10BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Using cursor P02LG5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A119BarAgrCod = P02LG5_A119BarAgrCod[0] ;
            A124BarAgrReo = P02LG5_A124BarAgrReo[0] ;
            A122BarAgrPar = P02LG5_A122BarAgrPar[0] ;
            GXv_char7[0] = A396EmprCod ;
            GXv_int4[0] = A119BarAgrCod ;
            GXv_int5[0] = A124BarAgrReo ;
            GXv_char6[0] = A122BarAgrPar ;
            GXv_char3[0] = AV8BarMaqCod ;
            new app.pupdmaq(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
            pcammaqb.this.A396EmprCod = GXv_char7[0] ;
            pcammaqb.this.A119BarAgrCod = GXv_int4[0] ;
            pcammaqb.this.A124BarAgrReo = GXv_int5[0] ;
            pcammaqb.this.A122BarAgrPar = GXv_char6[0] ;
            pcammaqb.this.AV8BarMaqCod = GXv_char3[0] ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcammaqb.this.A396EmprCod;
      this.aP1[0] = pcammaqb.this.A129BarCod;
      this.aP2[0] = pcammaqb.this.A132BarCodReo;
      this.aP3[0] = pcammaqb.this.A130BarCodPar;
      this.aP4[0] = pcammaqb.this.A2804RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcammaqb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      AV13EmprNom = "" ;
      AV11UsurCod = "" ;
      AV8BarMaqCod = "" ;
      scmdbuf = "" ;
      P02LG2_A396EmprCod = new String[] {""} ;
      P02LG2_A129BarCod = new int[1] ;
      P02LG2_A132BarCodReo = new byte[1] ;
      P02LG2_A130BarCodPar = new String[] {""} ;
      P02LG2_A2804RecLinMaq = new short[1] ;
      P02LG2_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      P02LG3_A396EmprCod = new String[] {""} ;
      P02LG3_A129BarCod = new int[1] ;
      P02LG3_A132BarCodReo = new byte[1] ;
      P02LG3_A130BarCodPar = new String[] {""} ;
      P02LG3_A180BarMaqCod = new String[] {""} ;
      P02LG3_A120BarAgrEst = new String[] {""} ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      AV14Inc_obs = "" ;
      AV10BarAgrEst = "" ;
      AV19Pgmname = "" ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      P02LG5_A396EmprCod = new String[] {""} ;
      P02LG5_A129BarCod = new int[1] ;
      P02LG5_A132BarCodReo = new byte[1] ;
      P02LG5_A130BarCodPar = new String[] {""} ;
      P02LG5_A119BarAgrCod = new int[1] ;
      P02LG5_A124BarAgrReo = new byte[1] ;
      P02LG5_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char7 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcammaqb__default(),
         new Object[] {
             new Object[] {
            P02LG2_A396EmprCod, P02LG2_A129BarCod, P02LG2_A132BarCodReo, P02LG2_A130BarCodPar, P02LG2_A2804RecLinMaq, P02LG2_A602MaqCod
            }
            , new Object[] {
            P02LG3_A396EmprCod, P02LG3_A129BarCod, P02LG3_A132BarCodReo, P02LG3_A130BarCodPar, P02LG3_A180BarMaqCod, P02LG3_A120BarAgrEst
            }
            , new Object[] {
            }
            , new Object[] {
            P02LG5_A396EmprCod, P02LG5_A129BarCod, P02LG5_A132BarCodReo, P02LG5_A130BarCodPar, P02LG5_A119BarAgrCod, P02LG5_A124BarAgrReo, P02LG5_A122BarAgrPar
            }
         }
      );
      AV19Pgmname = "PCAMMAQB" ;
      /* GeneXus formulas. */
      AV19Pgmname = "PCAMMAQB" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int5[] ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12Station ;
   private String AV13EmprNom ;
   private String AV11UsurCod ;
   private String AV8BarMaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String AV10BarAgrEst ;
   private String AV19Pgmname ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A122BarAgrPar ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private String AV14Inc_obs ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LG2_A396EmprCod ;
   private int[] P02LG2_A129BarCod ;
   private byte[] P02LG2_A132BarCodReo ;
   private String[] P02LG2_A130BarCodPar ;
   private short[] P02LG2_A2804RecLinMaq ;
   private String[] P02LG2_A602MaqCod ;
   private String[] P02LG3_A396EmprCod ;
   private int[] P02LG3_A129BarCod ;
   private byte[] P02LG3_A132BarCodReo ;
   private String[] P02LG3_A130BarCodPar ;
   private String[] P02LG3_A180BarMaqCod ;
   private String[] P02LG3_A120BarAgrEst ;
   private String[] P02LG5_A396EmprCod ;
   private int[] P02LG5_A129BarCod ;
   private byte[] P02LG5_A132BarCodReo ;
   private String[] P02LG5_A130BarCodPar ;
   private int[] P02LG5_A119BarAgrCod ;
   private byte[] P02LG5_A124BarAgrReo ;
   private String[] P02LG5_A122BarAgrPar ;
}

final  class pcammaqb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LG2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LG3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LG4", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02LG5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

