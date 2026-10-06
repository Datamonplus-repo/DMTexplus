package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcborradoformulas", "/app.formulaciontinte.wcborradoformulas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcborradoformulas extends GXWebObjectStub
{
   public wcborradoformulas( )
   {
   }

   public wcborradoformulas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcborradoformulas.class ));
   }

   public wcborradoformulas( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcborradoformulas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcborradoformulas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Formulas";
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

