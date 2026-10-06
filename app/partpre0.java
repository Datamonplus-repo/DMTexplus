package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partpre0 extends GXProcedure
{
   public partpre0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partpre0.class ), "" );
   }

   public partpre0( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           short[] aP3 ,
                           String[] aP4 )
   {
      partpre0.this.aP5 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        long[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             long[] aP5 )
   {
      partpre0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partpre0.this.A11604PArtId = aP1[0];
      this.aP1 = aP1;
      partpre0.this.A457FasCod = aP2[0];
      this.aP2 = aP2;
      partpre0.this.A7727ArtAdiCod = aP3[0];
      this.aP3 = aP3;
      partpre0.this.AV19Devolver = aP4[0];
      this.aP4 = aP4;
      partpre0.this.AV20Sal = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV24PreAca ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRACAR", ""), GXv_int2) ;
      partpre0.this.GXt_int1 = GXv_int2[0] ;
      AV24PreAca = GXt_int1 ;
      GXt_int1 = AV23PreTin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRTIAR", ""), GXv_int2) ;
      partpre0.this.GXt_int1 = GXv_int2[0] ;
      AV23PreTin = GXt_int1 ;
      Gx_msg = httpContext.getMessage( "Precios", "") + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
      /* Using cursor P053X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A7727ArtAdiCod), A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk53X2 = false ;
         A11611PAFOrd = P053X2_A11611PAFOrd[0] ;
         A8506PFAPre = P053X2_A8506PFAPre[0] ;
         n8506PFAPre = P053X2_n8506PFAPre[0] ;
         A8507PFATip = P053X2_A8507PFATip[0] ;
         n8507PFATip = P053X2_n8507PFATip[0] ;
         A829TipArtCod = P053X2_A829TipArtCod[0] ;
         A252CliCod = P053X2_A252CliCod[0] ;
         n252CliCod = P053X2_n252CliCod[0] ;
         A12301PArtTC = P053X2_A12301PArtTC[0] ;
         n12301PArtTC = P053X2_n12301PArtTC[0] ;
         A12300PArtColNum = P053X2_A12300PArtColNum[0] ;
         n12300PArtColNum = P053X2_n12300PArtColNum[0] ;
         A11550PArtColNom = P053X2_A11550PArtColNom[0] ;
         n11550PArtColNom = P053X2_n11550PArtColNom[0] ;
         A65ArtCod = P053X2_A65ArtCod[0] ;
         n65ArtCod = P053X2_n65ArtCod[0] ;
         A11592PAFPre = P053X2_A11592PAFPre[0] ;
         n11592PAFPre = P053X2_n11592PAFPre[0] ;
         A456FasActTin = P053X2_A456FasActTin[0] ;
         n456FasActTin = P053X2_n456FasActTin[0] ;
         A11568PArtUnd = P053X2_A11568PArtUnd[0] ;
         n11568PArtUnd = P053X2_n11568PArtUnd[0] ;
         A11549PArtRen = P053X2_A11549PArtRen[0] ;
         n11549PArtRen = P053X2_n11549PArtRen[0] ;
         A11567PArtKgm = P053X2_A11567PArtKgm[0] ;
         n11567PArtKgm = P053X2_n11567PArtKgm[0] ;
         A11566PArtMtr = P053X2_A11566PArtMtr[0] ;
         n11566PArtMtr = P053X2_n11566PArtMtr[0] ;
         A4343FasEstamp = P053X2_A4343FasEstamp[0] ;
         n4343FasEstamp = P053X2_n4343FasEstamp[0] ;
         A466FasPreKgm = P053X2_A466FasPreKgm[0] ;
         n466FasPreKgm = P053X2_n466FasPreKgm[0] ;
         A467FasPreMtr = P053X2_A467FasPreMtr[0] ;
         n467FasPreMtr = P053X2_n467FasPreMtr[0] ;
         A252CliCod = P053X2_A252CliCod[0] ;
         n252CliCod = P053X2_n252CliCod[0] ;
         A12301PArtTC = P053X2_A12301PArtTC[0] ;
         n12301PArtTC = P053X2_n12301PArtTC[0] ;
         A12300PArtColNum = P053X2_A12300PArtColNum[0] ;
         n12300PArtColNum = P053X2_n12300PArtColNum[0] ;
         A11550PArtColNom = P053X2_A11550PArtColNom[0] ;
         n11550PArtColNom = P053X2_n11550PArtColNom[0] ;
         A65ArtCod = P053X2_A65ArtCod[0] ;
         n65ArtCod = P053X2_n65ArtCod[0] ;
         A11568PArtUnd = P053X2_A11568PArtUnd[0] ;
         n11568PArtUnd = P053X2_n11568PArtUnd[0] ;
         A11549PArtRen = P053X2_A11549PArtRen[0] ;
         n11549PArtRen = P053X2_n11549PArtRen[0] ;
         A11567PArtKgm = P053X2_A11567PArtKgm[0] ;
         n11567PArtKgm = P053X2_n11567PArtKgm[0] ;
         A11566PArtMtr = P053X2_A11566PArtMtr[0] ;
         n11566PArtMtr = P053X2_n11566PArtMtr[0] ;
         A829TipArtCod = P053X2_A829TipArtCod[0] ;
         A11592PAFPre = P053X2_A11592PAFPre[0] ;
         n11592PAFPre = P053X2_n11592PAFPre[0] ;
         A456FasActTin = P053X2_A456FasActTin[0] ;
         n456FasActTin = P053X2_n456FasActTin[0] ;
         A4343FasEstamp = P053X2_A4343FasEstamp[0] ;
         n4343FasEstamp = P053X2_n4343FasEstamp[0] ;
         A466FasPreKgm = P053X2_A466FasPreKgm[0] ;
         n466FasPreKgm = P053X2_n466FasPreKgm[0] ;
         A467FasPreMtr = P053X2_A467FasPreMtr[0] ;
         n467FasPreMtr = P053X2_n467FasPreMtr[0] ;
         A8506PFAPre = P053X2_A8506PFAPre[0] ;
         n8506PFAPre = P053X2_n8506PFAPre[0] ;
         A8507PFATip = P053X2_A8507PFATip[0] ;
         n8507PFATip = P053X2_n8507PFATip[0] ;
         if ( A7727ArtAdiCod == 0 )
         {
            if ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( AV23PreTin == 1 )
               {
                  /* Using cursor P053X3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n11550PArtColNom), A11550PArtColNom, Boolean.valueOf(n12300PArtColNum), Integer.valueOf(A12300PArtColNum), Boolean.valueOf(n12301PArtTC), Short.valueOf(A12301PArtTC)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A494ForSer = P053X3_A494ForSer[0] ;
                     A482ForColNom = P053X3_A482ForColNom[0] ;
                     A483ForColNum = P053X3_A483ForColNum[0] ;
                     A831TipColCod = P053X3_A831TipColCod[0] ;
                     A583IntCod = P053X3_A583IntCod[0] ;
                     AV16IntCod = A583IntCod ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(1);
                  /* Using cursor P053X4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A829TipArtCod), Byte.valueOf(AV16IntCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A8521PreTAICod = P053X4_A8521PreTAICod[0] ;
                     A583IntCod = P053X4_A583IntCod[0] ;
                     A8524PreTAIDto = P053X4_A8524PreTAIDto[0] ;
                     n8524PreTAIDto = P053X4_n8524PreTAIDto[0] ;
                     A8523PreTAIImp = P053X4_A8523PreTAIImp[0] ;
                     n8523PreTAIImp = P053X4_n8523PreTAIImp[0] ;
                     A8525PreTAITpo = P053X4_A8525PreTAITpo[0] ;
                     n8525PreTAITpo = P053X4_n8525PreTAITpo[0] ;
                     AV17Dto = A8524PreTAIDto ;
                     AV21Pre = A8523PreTAIImp ;
                     AV18Tipo = A8525PreTAITpo ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(2);
                  if ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "M", "")) == 0 )
                  {
                     AV22Ren = A11549PArtRen ;
                     if ( AV22Ren.doubleValue() == 0 )
                     {
                        AV22Ren = DecimalUtil.doubleToDec(1) ;
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo sin rendimiento!", ""));
                     }
                  }
                  else
                  {
                     AV22Ren = DecimalUtil.doubleToDec(1) ;
                  }
                  if ( ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "K", "")) == 0 ) && ( DecimalUtil.compareTo(A11567PArtKgm, DecimalUtil.doubleToDec(360).divide(AV22Ren, 18, java.math.RoundingMode.DOWN)) < 0 ) )
                  {
                     AV17Dto = DecimalUtil.doubleToDec(0) ;
                  }
                  if ( ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "M", "")) == 0 ) && ( DecimalUtil.compareTo(A11566PArtMtr, DecimalUtil.doubleToDec(360).divide(AV22Ren, 18, java.math.RoundingMode.DOWN)) < 0 ) )
                  {
                     AV17Dto = DecimalUtil.doubleToDec(0) ;
                  }
               }
            }
            else if ( GXutil.strcmp(A4343FasEstamp, httpContext.getMessage( "S", "")) == 0 )
            {
            }
            else
            {
               if ( AV24PreAca == 1 )
               {
                  if ( A466FasPreKgm.doubleValue() > 0 )
                  {
                     AV21Pre = A466FasPreKgm ;
                     AV18Tipo = httpContext.getMessage( "K", "") ;
                  }
                  else
                  {
                     AV21Pre = A467FasPreMtr ;
                     AV18Tipo = httpContext.getMessage( "M", "") ;
                  }
               }
            }
         }
         else
         {
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P053X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P053X2_A11604PArtId[0] == A11604PArtId ) )
            {
               brk53X2 = false ;
               A11611PAFOrd = P053X2_A11611PAFOrd[0] ;
               A8506PFAPre = P053X2_A8506PFAPre[0] ;
               n8506PFAPre = P053X2_n8506PFAPre[0] ;
               A8507PFATip = P053X2_A8507PFATip[0] ;
               n8507PFATip = P053X2_n8507PFATip[0] ;
               A252CliCod = P053X2_A252CliCod[0] ;
               n252CliCod = P053X2_n252CliCod[0] ;
               A252CliCod = P053X2_A252CliCod[0] ;
               n252CliCod = P053X2_n252CliCod[0] ;
               A8506PFAPre = P053X2_A8506PFAPre[0] ;
               n8506PFAPre = P053X2_n8506PFAPre[0] ;
               A8507PFATip = P053X2_A8507PFATip[0] ;
               n8507PFATip = P053X2_n8507PFATip[0] ;
               if ( P053X2_A7727ArtAdiCod[0] == A7727ArtAdiCod )
               {
                  if ( GXutil.strcmp(P053X2_A457FasCod[0], A457FasCod) == 0 )
                  {
                     AV21Pre = A8506PFAPre ;
                     AV18Tipo = A8507PFATip ;
                  }
               }
               brk53X2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk53X2 )
         {
            brk53X2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV19Devolver, httpContext.getMessage( "P", "")) == 0 )
      {
         AV20Sal = (long)(DecimalUtil.decToDouble(AV21Pre)) ;
         Gx_msg += httpContext.getMessage( "Devolver : ", "") + AV19Devolver + httpContext.getMessage( ", Valor : ", "") + GXutil.trim( GXutil.str( AV20Sal, 10, 0)) ;
      }
      else if ( GXutil.strcmp(AV19Devolver, httpContext.getMessage( "D", "")) == 0 )
      {
         AV20Sal = (long)(DecimalUtil.decToDouble(AV17Dto)) ;
         Gx_msg += httpContext.getMessage( "Devolver : ", "") + AV19Devolver + httpContext.getMessage( ", Valor : ", "") + GXutil.trim( GXutil.str( AV20Sal, 10, 0)) ;
      }
      else if ( GXutil.strcmp(AV19Devolver, httpContext.getMessage( "T", "")) == 0 )
      {
         AV20Sal = GXutil.lval( AV18Tipo) ;
         Gx_msg += httpContext.getMessage( "Devolver : ", "") + AV19Devolver + httpContext.getMessage( ", Valor : ", "") + AV18Tipo ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partpre0.this.A396EmprCod;
      this.aP1[0] = partpre0.this.A11604PArtId;
      this.aP2[0] = partpre0.this.A457FasCod;
      this.aP3[0] = partpre0.this.A7727ArtAdiCod;
      this.aP4[0] = partpre0.this.AV19Devolver;
      this.aP5[0] = partpre0.this.AV20Sal;
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
      Gx_msg = "" ;
      scmdbuf = "" ;
      P053X2_A11611PAFOrd = new short[1] ;
      P053X2_A396EmprCod = new String[] {""} ;
      P053X2_A11604PArtId = new int[1] ;
      P053X2_A7727ArtAdiCod = new short[1] ;
      P053X2_A457FasCod = new String[] {""} ;
      P053X2_A8506PFAPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X2_n8506PFAPre = new boolean[] {false} ;
      P053X2_A8507PFATip = new String[] {""} ;
      P053X2_n8507PFATip = new boolean[] {false} ;
      P053X2_A829TipArtCod = new short[1] ;
      P053X2_A252CliCod = new int[1] ;
      P053X2_n252CliCod = new boolean[] {false} ;
      P053X2_A12301PArtTC = new short[1] ;
      P053X2_n12301PArtTC = new boolean[] {false} ;
      P053X2_A12300PArtColNum = new int[1] ;
      P053X2_n12300PArtColNum = new boolean[] {false} ;
      P053X2_A11550PArtColNom = new String[] {""} ;
      P053X2_n11550PArtColNom = new boolean[] {false} ;
      P053X2_A65ArtCod = new String[] {""} ;
      P053X2_n65ArtCod = new boolean[] {false} ;
      P053X2_A11592PAFPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X2_n11592PAFPre = new boolean[] {false} ;
      P053X2_A456FasActTin = new String[] {""} ;
      P053X2_n456FasActTin = new boolean[] {false} ;
      P053X2_A11568PArtUnd = new String[] {""} ;
      P053X2_n11568PArtUnd = new boolean[] {false} ;
      P053X2_A11549PArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X2_n11549PArtRen = new boolean[] {false} ;
      P053X2_A11567PArtKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X2_n11567PArtKgm = new boolean[] {false} ;
      P053X2_A11566PArtMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X2_n11566PArtMtr = new boolean[] {false} ;
      P053X2_A4343FasEstamp = new String[] {""} ;
      P053X2_n4343FasEstamp = new boolean[] {false} ;
      P053X2_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X2_n466FasPreKgm = new boolean[] {false} ;
      P053X2_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X2_n467FasPreMtr = new boolean[] {false} ;
      A8506PFAPre = DecimalUtil.ZERO ;
      A8507PFATip = "" ;
      A11550PArtColNom = "" ;
      A65ArtCod = "" ;
      A11592PAFPre = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A11568PArtUnd = "" ;
      A11549PArtRen = DecimalUtil.ZERO ;
      A11567PArtKgm = DecimalUtil.ZERO ;
      A11566PArtMtr = DecimalUtil.ZERO ;
      A4343FasEstamp = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      P053X3_A396EmprCod = new String[] {""} ;
      P053X3_A252CliCod = new int[1] ;
      P053X3_n252CliCod = new boolean[] {false} ;
      P053X3_A494ForSer = new String[] {""} ;
      P053X3_A482ForColNom = new String[] {""} ;
      P053X3_A483ForColNum = new int[1] ;
      P053X3_A831TipColCod = new byte[1] ;
      P053X3_A583IntCod = new byte[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P053X4_A396EmprCod = new String[] {""} ;
      P053X4_A252CliCod = new int[1] ;
      P053X4_n252CliCod = new boolean[] {false} ;
      P053X4_A8521PreTAICod = new short[1] ;
      P053X4_A583IntCod = new byte[1] ;
      P053X4_A8524PreTAIDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X4_n8524PreTAIDto = new boolean[] {false} ;
      P053X4_A8523PreTAIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053X4_n8523PreTAIImp = new boolean[] {false} ;
      P053X4_A8525PreTAITpo = new String[] {""} ;
      P053X4_n8525PreTAITpo = new boolean[] {false} ;
      A8524PreTAIDto = DecimalUtil.ZERO ;
      A8523PreTAIImp = DecimalUtil.ZERO ;
      A8525PreTAITpo = "" ;
      AV17Dto = DecimalUtil.ZERO ;
      AV21Pre = DecimalUtil.ZERO ;
      AV18Tipo = "" ;
      AV22Ren = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partpre0__default(),
         new Object[] {
             new Object[] {
            P053X2_A11611PAFOrd, P053X2_A396EmprCod, P053X2_A11604PArtId, P053X2_A7727ArtAdiCod, P053X2_A457FasCod, P053X2_A8506PFAPre, P053X2_n8506PFAPre, P053X2_A8507PFATip, P053X2_n8507PFATip, P053X2_A829TipArtCod,
            P053X2_A252CliCod, P053X2_n252CliCod, P053X2_A12301PArtTC, P053X2_n12301PArtTC, P053X2_A12300PArtColNum, P053X2_n12300PArtColNum, P053X2_A11550PArtColNom, P053X2_n11550PArtColNom, P053X2_A65ArtCod, P053X2_n65ArtCod,
            P053X2_A11592PAFPre, P053X2_n11592PAFPre, P053X2_A456FasActTin, P053X2_n456FasActTin, P053X2_A11568PArtUnd, P053X2_n11568PArtUnd, P053X2_A11549PArtRen, P053X2_n11549PArtRen, P053X2_A11567PArtKgm, P053X2_n11567PArtKgm,
            P053X2_A11566PArtMtr, P053X2_n11566PArtMtr, P053X2_A4343FasEstamp, P053X2_n4343FasEstamp, P053X2_A466FasPreKgm, P053X2_n466FasPreKgm, P053X2_A467FasPreMtr, P053X2_n467FasPreMtr
            }
            , new Object[] {
            P053X3_A396EmprCod, P053X3_A252CliCod, P053X3_A494ForSer, P053X3_A482ForColNom, P053X3_A483ForColNum, P053X3_A831TipColCod, P053X3_A583IntCod
            }
            , new Object[] {
            P053X4_A396EmprCod, P053X4_A252CliCod, P053X4_A8521PreTAICod, P053X4_A583IntCod, P053X4_A8524PreTAIDto, P053X4_n8524PreTAIDto, P053X4_A8523PreTAIImp, P053X4_n8523PreTAIImp, P053X4_A8525PreTAITpo, P053X4_n8525PreTAITpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24PreAca ;
   private byte AV23PreTin ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV16IntCod ;
   private short A7727ArtAdiCod ;
   private short A11611PAFOrd ;
   private short A829TipArtCod ;
   private short A12301PArtTC ;
   private short A8521PreTAICod ;
   private short Gx_err ;
   private int A11604PArtId ;
   private int A252CliCod ;
   private int A12300PArtColNum ;
   private int A483ForColNum ;
   private long AV20Sal ;
   private java.math.BigDecimal A8506PFAPre ;
   private java.math.BigDecimal A11592PAFPre ;
   private java.math.BigDecimal A11549PArtRen ;
   private java.math.BigDecimal A11567PArtKgm ;
   private java.math.BigDecimal A11566PArtMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A8524PreTAIDto ;
   private java.math.BigDecimal A8523PreTAIImp ;
   private java.math.BigDecimal AV17Dto ;
   private java.math.BigDecimal AV21Pre ;
   private java.math.BigDecimal AV22Ren ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV19Devolver ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A8507PFATip ;
   private String A11550PArtColNom ;
   private String A65ArtCod ;
   private String A456FasActTin ;
   private String A11568PArtUnd ;
   private String A4343FasEstamp ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A8525PreTAITpo ;
   private String AV18Tipo ;
   private boolean brk53X2 ;
   private boolean n8506PFAPre ;
   private boolean n8507PFATip ;
   private boolean n252CliCod ;
   private boolean n12301PArtTC ;
   private boolean n12300PArtColNum ;
   private boolean n11550PArtColNom ;
   private boolean n65ArtCod ;
   private boolean n11592PAFPre ;
   private boolean n456FasActTin ;
   private boolean n11568PArtUnd ;
   private boolean n11549PArtRen ;
   private boolean n11567PArtKgm ;
   private boolean n11566PArtMtr ;
   private boolean n4343FasEstamp ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n8524PreTAIDto ;
   private boolean n8523PreTAIImp ;
   private boolean n8525PreTAITpo ;
   private long[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P053X2_A11611PAFOrd ;
   private String[] P053X2_A396EmprCod ;
   private int[] P053X2_A11604PArtId ;
   private short[] P053X2_A7727ArtAdiCod ;
   private String[] P053X2_A457FasCod ;
   private java.math.BigDecimal[] P053X2_A8506PFAPre ;
   private boolean[] P053X2_n8506PFAPre ;
   private String[] P053X2_A8507PFATip ;
   private boolean[] P053X2_n8507PFATip ;
   private short[] P053X2_A829TipArtCod ;
   private int[] P053X2_A252CliCod ;
   private boolean[] P053X2_n252CliCod ;
   private short[] P053X2_A12301PArtTC ;
   private boolean[] P053X2_n12301PArtTC ;
   private int[] P053X2_A12300PArtColNum ;
   private boolean[] P053X2_n12300PArtColNum ;
   private String[] P053X2_A11550PArtColNom ;
   private boolean[] P053X2_n11550PArtColNom ;
   private String[] P053X2_A65ArtCod ;
   private boolean[] P053X2_n65ArtCod ;
   private java.math.BigDecimal[] P053X2_A11592PAFPre ;
   private boolean[] P053X2_n11592PAFPre ;
   private String[] P053X2_A456FasActTin ;
   private boolean[] P053X2_n456FasActTin ;
   private String[] P053X2_A11568PArtUnd ;
   private boolean[] P053X2_n11568PArtUnd ;
   private java.math.BigDecimal[] P053X2_A11549PArtRen ;
   private boolean[] P053X2_n11549PArtRen ;
   private java.math.BigDecimal[] P053X2_A11567PArtKgm ;
   private boolean[] P053X2_n11567PArtKgm ;
   private java.math.BigDecimal[] P053X2_A11566PArtMtr ;
   private boolean[] P053X2_n11566PArtMtr ;
   private String[] P053X2_A4343FasEstamp ;
   private boolean[] P053X2_n4343FasEstamp ;
   private java.math.BigDecimal[] P053X2_A466FasPreKgm ;
   private boolean[] P053X2_n466FasPreKgm ;
   private java.math.BigDecimal[] P053X2_A467FasPreMtr ;
   private boolean[] P053X2_n467FasPreMtr ;
   private String[] P053X3_A396EmprCod ;
   private int[] P053X3_A252CliCod ;
   private boolean[] P053X3_n252CliCod ;
   private String[] P053X3_A494ForSer ;
   private String[] P053X3_A482ForColNom ;
   private int[] P053X3_A483ForColNum ;
   private byte[] P053X3_A831TipColCod ;
   private byte[] P053X3_A583IntCod ;
   private String[] P053X4_A396EmprCod ;
   private int[] P053X4_A252CliCod ;
   private boolean[] P053X4_n252CliCod ;
   private short[] P053X4_A8521PreTAICod ;
   private byte[] P053X4_A583IntCod ;
   private java.math.BigDecimal[] P053X4_A8524PreTAIDto ;
   private boolean[] P053X4_n8524PreTAIDto ;
   private java.math.BigDecimal[] P053X4_A8523PreTAIImp ;
   private boolean[] P053X4_n8523PreTAIImp ;
   private String[] P053X4_A8525PreTAITpo ;
   private boolean[] P053X4_n8525PreTAITpo ;
}

final  class partpre0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P053X2", "SELECT T1.PAFOrd, T1.EmprCod, T1.PArtId, T1.ArtAdiCod, T4.FasCod, T7.PFAPre, T7.PFATip, T3.TipArtCod, T2.CliCod, T2.PArtTC, T2.PArtColNum, T2.PArtColNom, T2.ArtCod, T4.PAFPre, T5.FasActTin, T2.PArtUnd, T2.PArtRen, T2.PArtKgm, T2.PArtMtr, T5.FasEstamp, T6.FasPreKgm, T6.FasPreMtr FROM ((((((TXPPEDAFF T1 INNER JOIN TXPPedAEs T2 ON T2.EmprCod = T1.EmprCod AND T2.PArtId = T1.PArtId) LEFT JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod AND T3.ArtCod = T2.ArtCod) INNER JOIN TXPPedAFa T4 ON T4.EmprCod = T1.EmprCod AND T4.PArtId = T1.PArtId AND T4.PAFOrd = T1.PAFOrd) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = T1.EmprCod AND T5.FasCod = T4.FasCod) LEFT JOIN TXPPREFAS T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T2.CliCod AND T6.FasCod = T4.FasCod) LEFT JOIN TXPARTPFA T7 ON T7.EmprCod = T1.EmprCod AND T7.CliCod = T2.CliCod AND T7.FasCod = T4.FasCod AND T7.ArtAdiCod = T1.ArtAdiCod) WHERE (T1.EmprCod = ? and T1.PArtId = ?) AND (T1.ArtAdiCod = ?) AND (T4.FasCod = ?) ORDER BY T1.EmprCod, T1.PArtId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P053X3", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P053X4", "SELECT EmprCod, CliCod, PreTAICod, IntCod, PreTAIDto, PreTAIImp, PreTAITpo FROM TXPPRETA1 WHERE EmprCod = ? and CliCod = ? and PreTAICod = ? and IntCod = ? ORDER BY EmprCod, CliCod, PreTAICod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

