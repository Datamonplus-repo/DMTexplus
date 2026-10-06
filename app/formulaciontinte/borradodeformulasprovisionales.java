package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.borradodeformulasprovisionales", "/app.formulaciontinte.borradodeformulasprovisionales"})
@jakarta.servlet.annotation.MultipartConfig
public final  class borradodeformulasprovisionales extends GXWebObjectStub
{
   public borradodeformulasprovisionales( )
   {
   }

   public borradodeformulasprovisionales( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( borradodeformulasprovisionales.class ));
   }

   public borradodeformulasprovisionales( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new borradodeformulasprovisionales_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new borradodeformulasprovisionales_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Borrado de Formulas Provisionales";
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

