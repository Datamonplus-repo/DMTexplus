package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactbl", "/app.tactbl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactbl extends GXWebObjectStub
{
   public tactbl( )
   {
   }

   public tactbl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactbl.class ));
   }

   public tactbl( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactbl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactbl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO ACTIVIDAD BLANQUEO";
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

