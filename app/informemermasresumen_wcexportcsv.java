package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemermasresumen_wcexportcsv", "/app.informemermasresumen_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemermasresumen_wcexportcsv extends GXWebObjectStub
{
   public informemermasresumen_wcexportcsv( )
   {
   }

   public informemermasresumen_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemermasresumen_wcexportcsv.class ));
   }

   public informemermasresumen_wcexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemermasresumen_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemermasresumen_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Mermas Resumen";
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

