package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informeparoscodebar_wp", "/app.informeparoscodebar_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeparoscodebar_wp extends GXWebObjectStub
{
   public informeparoscodebar_wp( )
   {
   }

   public informeparoscodebar_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeparoscodebar_wp.class ));
   }

   public informeparoscodebar_wp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeparoscodebar_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeparoscodebar_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Paros Codebar (SDT)";
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

