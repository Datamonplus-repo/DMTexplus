package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pcarordemservico", "/app.pcarordemservico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pcarordemservico extends GXWebObjectStub
{
   public pcarordemservico( )
   {
   }

   public pcarordemservico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pcarordemservico.class ));
   }

   public pcarordemservico( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pcarordemservico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pcarordemservico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ordem de serviço";
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

