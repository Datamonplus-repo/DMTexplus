package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.borradodeformulas", "/app.formulaciontinte.borradodeformulas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class borradodeformulas extends GXWebObjectStub
{
   public borradodeformulas( )
   {
   }

   public borradodeformulas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( borradodeformulas.class ));
   }

   public borradodeformulas( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new borradodeformulas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new borradodeformulas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Borrado de Formulas";
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

