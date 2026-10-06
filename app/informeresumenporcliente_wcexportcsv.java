package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informeresumenporcliente_wcexportcsv", "/app.informeresumenporcliente_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeresumenporcliente_wcexportcsv extends GXWebObjectStub
{
   public informeresumenporcliente_wcexportcsv( )
   {
   }

   public informeresumenporcliente_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeresumenporcliente_wcexportcsv.class ));
   }

   public informeresumenporcliente_wcexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeresumenporcliente_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeresumenporcliente_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Resumenpor Cliente_WCExport CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

