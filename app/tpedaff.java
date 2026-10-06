package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedaff", "/app.tpedaff"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedaff extends GXWebObjectStub
{
   public tpedaff( )
   {
   }

   public tpedaff( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedaff.class ));
   }

   public tpedaff( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedaff_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedaff_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Adicionales p/Fases";
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

