package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informeoperarioscodebar_wp", "/app.informeoperarioscodebar_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeoperarioscodebar_wp extends GXWebObjectStub
{
   public informeoperarioscodebar_wp( )
   {
   }

   public informeoperarioscodebar_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeoperarioscodebar_wp.class ));
   }

   public informeoperarioscodebar_wp( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeoperarioscodebar_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeoperarioscodebar_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Operarios Codebar";
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

