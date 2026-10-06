package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.borradodeformulasprovisionales_wc", "/app.formulaciontinte.borradodeformulasprovisionales_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class borradodeformulasprovisionales_wc extends GXWebObjectStub
{
   public borradodeformulasprovisionales_wc( )
   {
   }

   public borradodeformulasprovisionales_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( borradodeformulasprovisionales_wc.class ));
   }

   public borradodeformulasprovisionales_wc( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new borradodeformulasprovisionales_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new borradodeformulasprovisionales_wc_impl(context).cleanup();
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

