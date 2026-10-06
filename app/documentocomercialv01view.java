package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentocomercialv01view", "/app.documentocomercialv01view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercialv01view extends GXWebObjectStub
{
   public documentocomercialv01view( )
   {
   }

   public documentocomercialv01view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercialv01view.class ));
   }

   public documentocomercialv01view( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercialv01view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercialv01view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Comercialv01 View";
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

