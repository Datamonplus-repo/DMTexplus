package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tixficopiar", "/app.facturacion.tixficopiar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tixficopiar extends GXWebObjectStub
{
   public tixficopiar( )
   {
   }

   public tixficopiar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tixficopiar.class ));
   }

   public tixficopiar( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tixficopiar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tixficopiar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Copiar TIxFI";
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

