package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedainc extends GXProcedure
{
   public ppedainc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedainc.class ), "" );
   }

   public ppedainc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      ppedainc.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      ppedainc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedainc.this.AV11Partid = aP1[0];
      this.aP1 = aP1;
      ppedainc.this.AV15Mens = aP2[0];
      this.aP2 = aP2;
      ppedainc.this.AV16PartTipdis = aP3[0];
      this.aP3 = aP3;
      ppedainc.this.AV10Incidencia = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Mens = "" ;
      AV10Incidencia = (byte)(0) ;
      GXt_decimal1 = DecimalUtil.doubleToDec(AV10Incidencia) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV11Partid ;
      GXv_decimal4[0] = GXt_decimal1 ;
      new app.ppedachkp(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_decimal4) ;
      ppedainc.this.A396EmprCod = GXv_char2[0] ;
      ppedainc.this.AV11Partid = GXv_int3[0] ;
      ppedainc.this.GXt_decimal1 = GXv_decimal4[0] ;
      AV10Incidencia = (byte)(DecimalUtil.decToDouble(GXt_decimal1)) ;
      if ( AV10Incidencia == 1 )
      {
         AV15Mens = httpContext.getMessage( "Aún hay precios sin cargar.", "") ;
      }
      /* Using cursor P04MK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11Partid)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11604PArtId = P04MK2_A11604PArtId[0] ;
         A11565PArtPie = P04MK2_A11565PArtPie[0] ;
         n11565PArtPie = P04MK2_n11565PArtPie[0] ;
         A11566PArtMtr = P04MK2_A11566PArtMtr[0] ;
         n11566PArtMtr = P04MK2_n11566PArtMtr[0] ;
         A11567PArtKgm = P04MK2_A11567PArtKgm[0] ;
         n11567PArtKgm = P04MK2_n11567PArtKgm[0] ;
         A11568PArtUnd = P04MK2_A11568PArtUnd[0] ;
         n11568PArtUnd = P04MK2_n11568PArtUnd[0] ;
         A11591PArtEstMtr = P04MK2_A11591PArtEstMtr[0] ;
         n11591PArtEstMtr = P04MK2_n11591PArtEstMtr[0] ;
         A11590PArtEstPie = P04MK2_A11590PArtEstPie[0] ;
         n11590PArtEstPie = P04MK2_n11590PArtEstPie[0] ;
         A11619PArtEstado = P04MK2_A11619PArtEstado[0] ;
         n11619PArtEstado = P04MK2_n11619PArtEstado[0] ;
         GXt_int5 = A11565PArtPie ;
         GXv_int6[0] = GXt_int5 ;
         new app.ppedatp(remoteHandle, context).execute( A396EmprCod, A11604PArtId, GXv_int6) ;
         ppedainc.this.GXt_int5 = GXv_int6[0] ;
         A11565PArtPie = GXt_int5 ;
         n11565PArtPie = false ;
         GXt_decimal1 = A11566PArtMtr ;
         GXv_decimal4[0] = GXt_decimal1 ;
         new app.ppedatm(remoteHandle, context).execute( A396EmprCod, A11604PArtId, GXv_decimal4) ;
         ppedainc.this.GXt_decimal1 = GXv_decimal4[0] ;
         A11566PArtMtr = GXt_decimal1 ;
         n11566PArtMtr = false ;
         GXt_decimal1 = A11567PArtKgm ;
         GXv_decimal4[0] = GXt_decimal1 ;
         new app.ppedatk(remoteHandle, context).execute( A396EmprCod, A11604PArtId, GXv_decimal4) ;
         ppedainc.this.GXt_decimal1 = GXv_decimal4[0] ;
         A11567PArtKgm = GXt_decimal1 ;
         n11567PArtKgm = false ;
         AV12Partpie = A11565PArtPie ;
         AV13Partmtr = A11566PArtMtr ;
         AV14Partkgm = A11567PArtKgm ;
         if ( AV12Partpie == 0 )
         {
            AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
            AV15Mens += httpContext.getMessage( "Piezas =", "") + GXutil.str( AV12Partpie, 4, 0) ;
            AV10Incidencia = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P04MK3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n11565PArtPie), Short.valueOf(A11565PArtPie), Boolean.valueOf(n11566PArtMtr), A11566PArtMtr, Boolean.valueOf(n11567PArtKgm), A11567PArtKgm, Boolean.valueOf(n11619PArtEstado), Byte.valueOf(A11619PArtEstado), A396EmprCod, Integer.valueOf(A11604PArtId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAEs");
            if (true) break;
         }
         if ( ( AV12Partpie == 0 ) && ( AV13Partmtr.doubleValue() == 0 ) && ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "M", "")) == 0 ) )
         {
            AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
            AV15Mens += httpContext.getMessage( "Metros =", "") + GXutil.str( AV13Partmtr, 9, 2) ;
            AV10Incidencia = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P04MK4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n11565PArtPie), Short.valueOf(A11565PArtPie), Boolean.valueOf(n11566PArtMtr), A11566PArtMtr, Boolean.valueOf(n11567PArtKgm), A11567PArtKgm, Boolean.valueOf(n11619PArtEstado), Byte.valueOf(A11619PArtEstado), A396EmprCod, Integer.valueOf(A11604PArtId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAEs");
            if (true) break;
         }
         if ( ( AV12Partpie == 0 ) && ( AV14Partkgm.doubleValue() == 0 ) && ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "K", "")) == 0 ) )
         {
            AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
            AV15Mens += httpContext.getMessage( "Kilos  =", "") + GXutil.str( AV14Partkgm, 9, 2) ;
            AV10Incidencia = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P04MK5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n11565PArtPie), Short.valueOf(A11565PArtPie), Boolean.valueOf(n11566PArtMtr), A11566PArtMtr, Boolean.valueOf(n11567PArtKgm), A11567PArtKgm, Boolean.valueOf(n11619PArtEstado), Byte.valueOf(A11619PArtEstado), A396EmprCod, Integer.valueOf(A11604PArtId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAEs");
            if (true) break;
         }
         if ( A11565PArtPie == 0 )
         {
            AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
            AV15Mens += httpContext.getMessage( "Sin crudo asignado", "") ;
            AV10Incidencia = (byte)(1) ;
         }
         if ( GXutil.strcmp(AV16PartTipdis, httpContext.getMessage( "T", "")) != 0 )
         {
            if ( ( A11565PArtPie > A11590PArtEstPie ) && ( DecimalUtil.compareTo(A11566PArtMtr, A11591PArtEstMtr) == 0 ) )
            {
               AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
               AV15Mens += httpContext.getMessage( "Piezas a estampar son menos que en crudo.", "") ;
               AV10Incidencia = (byte)(1) ;
            }
            if ( ( A11565PArtPie <= A11590PArtEstPie ) && ! ( DecimalUtil.compareTo(A11566PArtMtr, A11591PArtEstMtr) == 0 ) )
            {
               AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
               AV15Mens += httpContext.getMessage( "Metros a estampar difieren de crudo", "") ;
               AV10Incidencia = (byte)(1) ;
            }
            if ( ( A11565PArtPie > A11590PArtEstPie ) && ! ( DecimalUtil.compareTo(A11566PArtMtr, A11591PArtEstMtr) == 0 ) )
            {
               AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
               AV15Mens += httpContext.getMessage( "Piezas y metros a estampar difieren de crudo", "") ;
               AV10Incidencia = (byte)(1) ;
            }
            /* Using cursor P04MK6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A11572PAPMtr = P04MK6_A11572PAPMtr[0] ;
               n11572PAPMtr = P04MK6_n11572PAPMtr[0] ;
               A11571PAPPie = P04MK6_A11571PAPPie[0] ;
               n11571PAPPie = P04MK6_n11571PAPPie[0] ;
               A11610PAPCod = P04MK6_A11610PAPCod[0] ;
               if ( ( A11571PAPPie == 0 ) && ( A11572PAPMtr.doubleValue() != 0 ) )
               {
                  AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
                  AV15Mens += httpContext.getMessage( "Pinta ", "") + GXutil.trim( A11610PAPCod) + httpContext.getMessage( "Piezas = 0", "") ;
                  AV10Incidencia = (byte)(1) ;
               }
               if ( ( A11572PAPMtr.doubleValue() == 0 ) && ( A11571PAPPie != 0 ) )
               {
                  AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
                  AV15Mens += httpContext.getMessage( "Pinta ", "") + GXutil.trim( A11610PAPCod) + httpContext.getMessage( "Metros = 0", "") ;
                  AV10Incidencia = (byte)(1) ;
               }
               if ( ( A11572PAPMtr.doubleValue() == 0 ) && ( A11571PAPPie == 0 ) )
               {
                  AV15Mens += ((GXutil.strcmp(AV15Mens, "")==0) ? "" : "; ") ;
                  AV15Mens += httpContext.getMessage( "Pinta ", "") + GXutil.trim( A11610PAPCod) + httpContext.getMessage( "Metros y kilos = 0", "") ;
                  AV10Incidencia = (byte)(1) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         AV10Incidencia = (byte)(((AV10Incidencia==1) ? 0 : 1)) ;
         A11619PArtEstado = ((A11619PArtEstado<2) ? AV10Incidencia : A11619PArtEstado) ;
         n11619PArtEstado = false ;
         /* Using cursor P04MK7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n11565PArtPie), Short.valueOf(A11565PArtPie), Boolean.valueOf(n11566PArtMtr), A11566PArtMtr, Boolean.valueOf(n11567PArtKgm), A11567PArtKgm, Boolean.valueOf(n11619PArtEstado), Byte.valueOf(A11619PArtEstado), A396EmprCod, Integer.valueOf(A11604PArtId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAEs");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV15Mens = ((AV10Incidencia==0) ? AV15Mens : httpContext.getMessage( "Sin incidencias", "")) ;
      AV15Mens += "." ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedainc.this.A396EmprCod;
      this.aP1[0] = ppedainc.this.AV11Partid;
      this.aP2[0] = ppedainc.this.AV15Mens;
      this.aP3[0] = ppedainc.this.AV16PartTipdis;
      this.aP4[0] = ppedainc.this.AV10Incidencia;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      scmdbuf = "" ;
      P04MK2_A396EmprCod = new String[] {""} ;
      P04MK2_A11604PArtId = new int[1] ;
      P04MK2_A11565PArtPie = new short[1] ;
      P04MK2_n11565PArtPie = new boolean[] {false} ;
      P04MK2_A11566PArtMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04MK2_n11566PArtMtr = new boolean[] {false} ;
      P04MK2_A11567PArtKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04MK2_n11567PArtKgm = new boolean[] {false} ;
      P04MK2_A11568PArtUnd = new String[] {""} ;
      P04MK2_n11568PArtUnd = new boolean[] {false} ;
      P04MK2_A11591PArtEstMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04MK2_n11591PArtEstMtr = new boolean[] {false} ;
      P04MK2_A11590PArtEstPie = new short[1] ;
      P04MK2_n11590PArtEstPie = new boolean[] {false} ;
      P04MK2_A11619PArtEstado = new byte[1] ;
      P04MK2_n11619PArtEstado = new boolean[] {false} ;
      A11566PArtMtr = DecimalUtil.ZERO ;
      A11567PArtKgm = DecimalUtil.ZERO ;
      A11568PArtUnd = "" ;
      A11591PArtEstMtr = DecimalUtil.ZERO ;
      GXv_int6 = new short[1] ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV13Partmtr = DecimalUtil.ZERO ;
      AV14Partkgm = DecimalUtil.ZERO ;
      P04MK6_A396EmprCod = new String[] {""} ;
      P04MK6_A11604PArtId = new int[1] ;
      P04MK6_A11572PAPMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04MK6_n11572PAPMtr = new boolean[] {false} ;
      P04MK6_A11571PAPPie = new short[1] ;
      P04MK6_n11571PAPPie = new boolean[] {false} ;
      P04MK6_A11610PAPCod = new String[] {""} ;
      A11572PAPMtr = DecimalUtil.ZERO ;
      A11610PAPCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedainc__default(),
         new Object[] {
             new Object[] {
            P04MK2_A396EmprCod, P04MK2_A11604PArtId, P04MK2_A11565PArtPie, P04MK2_n11565PArtPie, P04MK2_A11566PArtMtr, P04MK2_n11566PArtMtr, P04MK2_A11567PArtKgm, P04MK2_n11567PArtKgm, P04MK2_A11568PArtUnd, P04MK2_n11568PArtUnd,
            P04MK2_A11591PArtEstMtr, P04MK2_n11591PArtEstMtr, P04MK2_A11590PArtEstPie, P04MK2_n11590PArtEstPie, P04MK2_A11619PArtEstado, P04MK2_n11619PArtEstado
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04MK6_A396EmprCod, P04MK6_A11604PArtId, P04MK6_A11572PAPMtr, P04MK6_n11572PAPMtr, P04MK6_A11571PAPPie, P04MK6_n11571PAPPie, P04MK6_A11610PAPCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Incidencia ;
   private byte A11619PArtEstado ;
   private short A11565PArtPie ;
   private short A11590PArtEstPie ;
   private short GXt_int5 ;
   private short GXv_int6[] ;
   private short AV12Partpie ;
   private short A11571PAPPie ;
   private short Gx_err ;
   private int AV11Partid ;
   private int GXv_int3[] ;
   private int A11604PArtId ;
   private java.math.BigDecimal A11566PArtMtr ;
   private java.math.BigDecimal A11567PArtKgm ;
   private java.math.BigDecimal A11591PArtEstMtr ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV13Partmtr ;
   private java.math.BigDecimal AV14Partkgm ;
   private java.math.BigDecimal A11572PAPMtr ;
   private String A396EmprCod ;
   private String AV16PartTipdis ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A11568PArtUnd ;
   private String A11610PAPCod ;
   private boolean n11565PArtPie ;
   private boolean n11566PArtMtr ;
   private boolean n11567PArtKgm ;
   private boolean n11568PArtUnd ;
   private boolean n11591PArtEstMtr ;
   private boolean n11590PArtEstPie ;
   private boolean n11619PArtEstado ;
   private boolean n11572PAPMtr ;
   private boolean n11571PAPPie ;
   private String AV15Mens ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04MK2_A396EmprCod ;
   private int[] P04MK2_A11604PArtId ;
   private short[] P04MK2_A11565PArtPie ;
   private boolean[] P04MK2_n11565PArtPie ;
   private java.math.BigDecimal[] P04MK2_A11566PArtMtr ;
   private boolean[] P04MK2_n11566PArtMtr ;
   private java.math.BigDecimal[] P04MK2_A11567PArtKgm ;
   private boolean[] P04MK2_n11567PArtKgm ;
   private String[] P04MK2_A11568PArtUnd ;
   private boolean[] P04MK2_n11568PArtUnd ;
   private java.math.BigDecimal[] P04MK2_A11591PArtEstMtr ;
   private boolean[] P04MK2_n11591PArtEstMtr ;
   private short[] P04MK2_A11590PArtEstPie ;
   private boolean[] P04MK2_n11590PArtEstPie ;
   private byte[] P04MK2_A11619PArtEstado ;
   private boolean[] P04MK2_n11619PArtEstado ;
   private String[] P04MK6_A396EmprCod ;
   private int[] P04MK6_A11604PArtId ;
   private java.math.BigDecimal[] P04MK6_A11572PAPMtr ;
   private boolean[] P04MK6_n11572PAPMtr ;
   private short[] P04MK6_A11571PAPPie ;
   private boolean[] P04MK6_n11571PAPPie ;
   private String[] P04MK6_A11610PAPCod ;
}

final  class ppedainc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04MK2", "SELECT EmprCod, PArtId, PArtPie, PArtMtr, PArtKgm, PArtUnd, PArtEstMtr, PArtEstPie, PArtEstado FROM TXPPedAEs WHERE EmprCod = ? and PArtId = ? ORDER BY EmprCod, PArtId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04MK3", "UPDATE TXPPedAEs SET PArtPie=?, PArtMtr=?, PArtKgm=?, PArtEstado=?  WHERE EmprCod = ? AND PArtId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAEs")
         ,new UpdateCursor("P04MK4", "UPDATE TXPPedAEs SET PArtPie=?, PArtMtr=?, PArtKgm=?, PArtEstado=?  WHERE EmprCod = ? AND PArtId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAEs")
         ,new UpdateCursor("P04MK5", "UPDATE TXPPedAEs SET PArtPie=?, PArtMtr=?, PArtKgm=?, PArtEstado=?  WHERE EmprCod = ? AND PArtId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAEs")
         ,new ForEachCursor("P04MK6", "SELECT EmprCod, PArtId, PAPMtr, PAPPie, PAPCod FROM TXPPedAPi WHERE EmprCod = ? and PArtId = ? ORDER BY EmprCod, PArtId, PAPCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04MK7", "UPDATE TXPPedAEs SET PArtPie=?, PArtMtr=?, PArtKgm=?, PArtEstado=?  WHERE EmprCod = ? AND PArtId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAEs")
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 12);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
      }
   }

}

