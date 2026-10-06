package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rsimulaz", "/app.formulaciontinte.rsimulaz"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rsimulaz extends GXWebObjectStub
{
   public rsimulaz( )
   {
   }

   public rsimulaz( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rsimulaz.class ));
   }

   public rsimulaz( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rsimulaz_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rsimulaz_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Simulacion Color";
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

