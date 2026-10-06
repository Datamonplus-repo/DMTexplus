package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informestrabajosexternos", "/app.informestrabajosexternos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informestrabajosexternos extends GXWebObjectStub
{
   public informestrabajosexternos( )
   {
   }

   public informestrabajosexternos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informestrabajosexternos.class ));
   }

   public informestrabajosexternos( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informestrabajosexternos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informestrabajosexternos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes Trabajos Externos";
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

