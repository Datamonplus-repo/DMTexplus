package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrparprodscget extends GXProcedure
{
   public mrparprodscget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrparprodscget.class ), "" );
   }

   public mrparprodscget( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              GXSimpleCollection<String> aP1 ,
                              GXSimpleCollection<String> aP2 ,
                              GXSimpleCollection<String> aP3 ,
                              GXSimpleCollection<Short> aP4 ,
                              String aP5 ,
                              String aP6 ,
                              java.util.Date aP7 ,
                              String aP8 ,
                              String[] aP9 )
   {
      mrparprodscget.this.aP10 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        GXSimpleCollection<String> aP1 ,
                        GXSimpleCollection<String> aP2 ,
                        GXSimpleCollection<String> aP3 ,
                        GXSimpleCollection<Short> aP4 ,
                        String aP5 ,
                        String aP6 ,
                        java.util.Date aP7 ,
                        String aP8 ,
                        String[] aP9 ,
                        boolean[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             GXSimpleCollection<String> aP1 ,
                             GXSimpleCollection<String> aP2 ,
                             GXSimpleCollection<String> aP3 ,
                             GXSimpleCollection<Short> aP4 ,
                             String aP5 ,
                             String aP6 ,
                             java.util.Date aP7 ,
                             String aP8 ,
                             String[] aP9 ,
                             boolean[] aP10 )
   {
      mrparprodscget.this.AV13EmprCod = aP0;
      mrparprodscget.this.AV15MaqCodCollection = aP1;
      mrparprodscget.this.AV16FasCodCollection = aP2;
      mrparprodscget.this.AV17HdrCollection = aP3;
      mrparprodscget.this.AV18ParFasCodCollection = aP4;
      mrparprodscget.this.AV19UsurCod = aP5;
      mrparprodscget.this.AV12Ip = aP6;
      mrparprodscget.this.AV20Now = aP7;
      mrparprodscget.this.AV21MTkn = aP8;
      mrparprodscget.this.aP9 = aP9;
      mrparprodscget.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = false ;
      AV10MRParPrPLC = "" ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "&ParFasCodCollection:%1", ""), AV18ParFasCodCollection.toJSonString(false), "", "", "", "", "", "", "", ""), AV24Pgmname) ;
      AV25GXLvl4 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14693MEPrMaqCod ,
                                           AV15MaqCodCollection ,
                                           A14691MEPrFasCod ,
                                           AV16FasCodCollection ,
                                           A14697MEPrHdr ,
                                           AV17HdrCollection ,
                                           Short.valueOf(A14695MEPrParCod) ,
                                           AV18ParFasCodCollection ,
                                           A14698MEPrUsu ,
                                           AV19UsurCod ,
                                           A14699MEPrIp ,
                                           AV12Ip ,
                                           A14701MEPrTkn ,
                                           AV21MTkn ,
                                           AV13EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AV32 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV19UsurCod, AV12Ip, AV21MTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14701MEPrTkn = P0AV32_A14701MEPrTkn[0] ;
         A14699MEPrIp = P0AV32_A14699MEPrIp[0] ;
         A14698MEPrUsu = P0AV32_A14698MEPrUsu[0] ;
         A14695MEPrParCod = P0AV32_A14695MEPrParCod[0] ;
         A14697MEPrHdr = P0AV32_A14697MEPrHdr[0] ;
         A14691MEPrFasCod = P0AV32_A14691MEPrFasCod[0] ;
         A14693MEPrMaqCod = P0AV32_A14693MEPrMaqCod[0] ;
         A396EmprCod = P0AV32_A396EmprCod[0] ;
         A14696MEPrParDsc = P0AV32_A14696MEPrParDsc[0] ;
         AV25GXLvl4 = (byte)(1) ;
         AV10MRParPrPLC = GXutil.trim( A14696MEPrParDsc) ;
         AV8Existe = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV25GXLvl4 == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "No encontrado para &ParFasCodCollection:%1", ""), AV18ParFasCodCollection.toJSonString(false), "", "", "", "", "", "", "", ""), AV24Pgmname) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP9[0] = mrparprodscget.this.AV10MRParPrPLC;
      this.aP10[0] = mrparprodscget.this.AV8Existe;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10MRParPrPLC = "" ;
      AV24Pgmname = "" ;
      scmdbuf = "" ;
      A14693MEPrMaqCod = "" ;
      A14691MEPrFasCod = "" ;
      A14697MEPrHdr = "" ;
      A14698MEPrUsu = "" ;
      A14699MEPrIp = "" ;
      A14701MEPrTkn = "" ;
      A396EmprCod = "" ;
      P0AV32_A14701MEPrTkn = new String[] {""} ;
      P0AV32_A14699MEPrIp = new String[] {""} ;
      P0AV32_A14698MEPrUsu = new String[] {""} ;
      P0AV32_A14695MEPrParCod = new short[1] ;
      P0AV32_A14697MEPrHdr = new String[] {""} ;
      P0AV32_A14691MEPrFasCod = new String[] {""} ;
      P0AV32_A14693MEPrMaqCod = new String[] {""} ;
      P0AV32_A396EmprCod = new String[] {""} ;
      P0AV32_A14696MEPrParDsc = new String[] {""} ;
      A14696MEPrParDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparprodscget__default(),
         new Object[] {
             new Object[] {
            P0AV32_A14701MEPrTkn, P0AV32_A14699MEPrIp, P0AV32_A14698MEPrUsu, P0AV32_A14695MEPrParCod, P0AV32_A14697MEPrHdr, P0AV32_A14691MEPrFasCod, P0AV32_A14693MEPrMaqCod, P0AV32_A396EmprCod, P0AV32_A14696MEPrParDsc
            }
         }
      );
      AV24Pgmname = "Ingenieria.MRParProDscGet" ;
      /* GeneXus formulas. */
      AV24Pgmname = "Ingenieria.MRParProDscGet" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl4 ;
   private short A14695MEPrParCod ;
   private short Gx_err ;
   private String AV13EmprCod ;
   private String AV19UsurCod ;
   private String AV24Pgmname ;
   private String scmdbuf ;
   private String A14693MEPrMaqCod ;
   private String A14691MEPrFasCod ;
   private String A14697MEPrHdr ;
   private String A14698MEPrUsu ;
   private String A396EmprCod ;
   private String A14696MEPrParDsc ;
   private java.util.Date AV20Now ;
   private boolean AV8Existe ;
   private String AV12Ip ;
   private String AV21MTkn ;
   private String AV10MRParPrPLC ;
   private String A14699MEPrIp ;
   private String A14701MEPrTkn ;
   private GXSimpleCollection<Short> AV18ParFasCodCollection ;
   private boolean[] aP10 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AV32_A14701MEPrTkn ;
   private String[] P0AV32_A14699MEPrIp ;
   private String[] P0AV32_A14698MEPrUsu ;
   private short[] P0AV32_A14695MEPrParCod ;
   private String[] P0AV32_A14697MEPrHdr ;
   private String[] P0AV32_A14691MEPrFasCod ;
   private String[] P0AV32_A14693MEPrMaqCod ;
   private String[] P0AV32_A396EmprCod ;
   private String[] P0AV32_A14696MEPrParDsc ;
   private GXSimpleCollection<String> AV15MaqCodCollection ;
   private GXSimpleCollection<String> AV16FasCodCollection ;
   private GXSimpleCollection<String> AV17HdrCollection ;
}

final  class mrparprodscget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AV32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV15MaqCodCollection ,
                                          String A14691MEPrFasCod ,
                                          GXSimpleCollection<String> AV16FasCodCollection ,
                                          String A14697MEPrHdr ,
                                          GXSimpleCollection<String> AV17HdrCollection ,
                                          short A14695MEPrParCod ,
                                          GXSimpleCollection<Short> AV18ParFasCodCollection ,
                                          String A14698MEPrUsu ,
                                          String AV19UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV12Ip ,
                                          String A14701MEPrTkn ,
                                          String AV21MTkn ,
                                          String AV13EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[4];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT * FROM (SELECT DISTINCT NULL AS MEPrTkn, NULL AS MEPrIp, NULL AS MEPrUsu, MEPrParCod, NULL AS MEPrHdr, NULL AS MEPrFasCod, NULL AS MEPrMaqCod, NULL AS EmprCod," ;
      scmdbuf += " MEPrParDsc FROM ( SELECT MEPrTkn, MEPrIp, MEPrUsu, MEPrParCod, MEPrHdr, MEPrFasCod, MEPrMaqCod, EmprCod, MEPrParDsc FROM MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV15MaqCodCollection, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV16FasCodCollection, "MEPrFasCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV17HdrCollection, "MEPrHdr IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV18ParFasCodCollection, "MEPrParCod IN (", ")")+")");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT) WHERE rownum <= 1" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0AV32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AV32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 256);
               }
               return;
      }
   }

}

