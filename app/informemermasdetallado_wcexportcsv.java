package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemermasdetallado_wcexportcsv", "/app.informemermasdetallado_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemermasdetallado_wcexportcsv extends GXWebObjectStub
{
   public informemermasdetallado_wcexportcsv( )
   {
   }

   public informemermasdetallado_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemermasdetallado_wcexportcsv.class ));
   }

   public informemermasdetallado_wcexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemermasdetallado_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemermasdetallado_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Mermas Detallado_WCExport CSV";
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

