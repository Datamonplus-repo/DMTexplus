package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rhrhr021", "/app.rhrhr021"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rhrhr021 extends GXWebObjectStub
{
   public rhrhr021( )
   {
   }

   public rhrhr021( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rhrhr021.class ));
   }

   public rhrhr021( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rhrhr021_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rhrhr021_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO RECETAS, IMP.RECETA";
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

